using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace InventoryService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class Inventory : InventoryInterface
    {
        public Product GetProductWithName(string name)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "Select * from products where name=@name";
            SqlParameter p = new SqlParameter("@name", name);
            cmd.Parameters.Add(p);
            con.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            Product prod = new Product();
            while (reader.Read())
            {
                prod.Id = reader.GetInt32(0);
                prod.Name = reader.GetString(1);
                prod.Price = reader.GetDecimal(2);
                prod.Stock = reader.GetInt32(3);
                prod.Category = reader.GetString(4);
            }
            reader.Close();
            con.Close();
            return prod;
        }

        public List<Product> GetProducts(int value)
        {
            SqlDataAdapter da = new SqlDataAdapter("SELECT * from products",@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            DataSet ds = new DataSet();
            da.Fill(ds, "products");
            var datalist = new List<Product>();
            foreach(DataRow row in ds.Tables[0].Rows)
            {
                var prod = new Product();
                prod.Id = (int)row[0];
                prod.Name = row[1].ToString();
                prod.Price = (decimal)row[2];
                prod.Stock = (int)row[3];
                prod.Category = row[4].ToString();
                datalist.Add(prod);
            }
            return datalist;
        }

        public List<Product> GetProductsOfCategory(string category)
        {
            SqlDataAdapter da = new SqlDataAdapter("SELECT * from products where category=@Category", @"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            da.SelectCommand.Parameters.AddWithValue("@Category", category);
            DataSet ds = new DataSet();
            da.Fill(ds, "products");
            var datalist = new List<Product>();
            foreach (DataRow row in ds.Tables[0].Rows)
            {
                var prod = new Product();
                prod.Id = (int)row[0];
                prod.Name = row[1].ToString();
                prod.Price = (decimal)row[2];
                prod.Stock = (int)row[3];
                prod.Category = row[4].ToString();
                datalist.Add(prod);
            }
            return datalist;
        }

        public string AddProduct(string Name,decimal Price,int Stock,string Category)
        {
            string result = "";
            try
            {
                SqlConnection conn = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
                SqlCommand cmdd = new SqlCommand();
                cmdd.Connection = conn;
                cmdd.CommandText = "Select count(*) from products where name=@name";
                SqlParameter p = new SqlParameter("@name", Name);
                cmdd.Parameters.Add(p);
                conn.Open();
                Int32 count = (Int32)cmdd.ExecuteScalar();
                
                if (count == 0)
                {
                    SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
                    SqlCommand cmd = new SqlCommand();



                    string Query = @"INSERT INTO products (name,price,stock,category)  
                                               Values(@name,@price,@stock,@category)"; ;

                    cmd = new SqlCommand(Query, con);
                    //cmd.Parameters.AddWithValue("@id", prod.Id);
                    cmd.Parameters.AddWithValue("@name", Name);
                    cmd.Parameters.AddWithValue("@price", Price);
                    cmd.Parameters.AddWithValue("@stock", Stock);
                    cmd.Parameters.AddWithValue("@category", Category);
                    con.Open();
                    cmd.ExecuteNonQuery();
                    con.Close();
                    result = "Record Added Successfully !";
                }
                else {
                    result = "record exists";
                }
            }
            catch (FaultException fex)
            {
                Console.WriteLine(fex);
                result = "Error";
            }

            return result;
        }

        public string UpdateStock(int Id,int Stock)
        {
            string result = "";
            try
            {
                if (Stock < 0)
                {
                    result = "not to be updated";
                }
                else
                {

                    SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
                    SqlCommand cmd = new SqlCommand();

                    string Query = @"UPDATE products SET stock=@stock WHERE Id=@id";

                    cmd = new SqlCommand(Query, con);
                    cmd.Parameters.AddWithValue("@id", Id);
                    //cmd.Parameters.AddWithValue("@name", Name);
                    //cmd.Parameters.AddWithValue("@price", Price);
                    cmd.Parameters.AddWithValue("@stock", Stock);
                    //cmd.Parameters.AddWithValue("@category", Category);
                    con.Open();
                    cmd.ExecuteNonQuery();
                    con.Close();
                    result = "Record Updated Successfully !";
                }
            }
            catch (FaultException fex)
            {
                Console.WriteLine(fex);
                result = "Error";
            }

            return result;
        }
        public string UpdatePrice(int Id, decimal Price)
        {
            string result = "";
            try
            {
                if (Price < 0)
                {
                    result = "not to be updated";
                }
                else
                {

                    SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
                    SqlCommand cmd = new SqlCommand();

                    string Query = @"UPDATE products SET price=@price WHERE Id=@id";

                    cmd = new SqlCommand(Query, con);
                    cmd.Parameters.AddWithValue("@id", Id);
                    //cmd.Parameters.AddWithValue("@name", Name);
                    cmd.Parameters.AddWithValue("@price", Price);
                    //cmd.Parameters.AddWithValue("@stock", Stock);
                    //cmd.Parameters.AddWithValue("@category", Category);
                    con.Open();
                    cmd.ExecuteNonQuery();
                    con.Close();
                    result = "Record Updated Successfully !";
                }
            }
            catch (FaultException fex)
            {
                Console.WriteLine(fex);
                result = "Error";
            }

            return result;
        }
        public string UpdateName(int Id, string Name)
        {
            string result = "";
            try
            {
                if (String.IsNullOrEmpty(Name))
                {
                    result = "not to be updated";
                }
                else
                {
                    SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
                    SqlCommand cmd = new SqlCommand();

                    string Query = @"UPDATE products SET name=@name WHERE Id=@id";

                    cmd = new SqlCommand(Query, con);
                    cmd.Parameters.AddWithValue("@id", Id);
                    cmd.Parameters.AddWithValue("@name", Name);
                    //cmd.Parameters.AddWithValue("@price", Price);
                    //cmd.Parameters.AddWithValue("@stock", Stock);
                    //cmd.Parameters.AddWithValue("@category", Category);
                    con.Open();
                    cmd.ExecuteNonQuery();
                    con.Close();
                    result = "Record Updated Successfully !";
                }
            }
            catch (FaultException fex)
            {
                Console.WriteLine(fex);
                result = "Error";
            }

            return result;
        }

        public string DeleteProduct(int id)
        {
            string result = "";
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            string Query = "DELETE FROM products Where Id=@id";
            cmd = new SqlCommand(Query, con);
            cmd.Parameters.AddWithValue("@id", id);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
            result = "Record Deleted Successfully!";
            return result;
        }

        public Product GetProductWithId(int id)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV13;Initial Catalog=InventoryDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "Select * from products where Id=@id";
            SqlParameter p = new SqlParameter("@id", id);
            cmd.Parameters.Add(p);
            con.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            Product prod = new Product();
            while (reader.Read())
            {
                prod.Id = reader.GetInt32(0);
                prod.Name = reader.GetString(1);
                prod.Price = reader.GetDecimal(2);
                prod.Stock = reader.GetInt32(3);
                prod.Category = reader.GetString(4);
            }
            reader.Close();
            con.Close();
            return prod;
        }
    }
}
