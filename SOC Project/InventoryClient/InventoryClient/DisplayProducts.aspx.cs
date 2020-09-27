using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace InventoryClient
{
    public partial class DisplayProducts : System.Web.UI.Page
    {
        ServiceReference.InventoryInterfaceClient client;
        protected void Page_Load(object sender, EventArgs e)
        {
            Label1.Visible = false;
            client = new ServiceReference.InventoryInterfaceClient("BasicHttpBinding_InventoryInterface");

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
           
            var datalist = client.GetProducts(0);
            GridView1.DataSource = datalist;
            GridView1.DataBind();
            RadioButtonList1.DataSource = Application["CategoryList"];
            RadioButtonList1.DataBind();
        }

        protected void RadioButtonList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string cat=RadioButtonList1.SelectedValue;
            var catdatalist = client.GetProductsOfCategory(cat);
            GridView1.DataSource = catdatalist;
            GridView1.DataBind();
            RadioButtonList1.DataSource = Application["CategoryList"];
            RadioButtonList1.DataBind();
        }

        protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void GridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
        {
            decimal newPrice,d;
            int newStock;
            GridViewRow row = GridView1.Rows[e.RowIndex];
            TextBox textName = (TextBox)row.Cells[3].Controls[0];
            TextBox textPrice = (TextBox)row.Cells[4].Controls[0];
            TextBox textStock = (TextBox)row.Cells[5].Controls[0];
            
            Label1.Text = textName.Text + " " + textPrice.Text + " "+textStock.Text;
            int current_id = Convert.ToInt32(Application["ProductId"]);
            client.UpdateName(current_id,textName.Text);
            if (textPrice.Text.Equals(null)||textPrice.Text.Equals("")||!Decimal.TryParse(textPrice.Text,out d))
            {
                newPrice = -999;
            }
            else
            {
                newPrice = Convert.ToDecimal(textPrice.Text);
            }
            client.UpdatePrice(current_id,newPrice);
            if (textStock.Text.Equals(null)||textStock.Text.Equals("")|| !Decimal.TryParse(textStock.Text, out d))
            {
                newStock = -999;
            }
            else
            {
                newStock = Convert.ToInt32(textStock.Text);
            }
            client.UpdateStock(current_id,newStock);
            Label1.Text = "Updated";
            GridView1.EditIndex = -1;
            var datalist = client.GetProducts(0);
            GridView1.DataSource = datalist;
            GridView1.DataBind();

        }

        protected void GridView1_RowEditing(object sender, GridViewEditEventArgs e)
        {
            GridViewRow row = GridView1.Rows[e.NewEditIndex];
            string id = row.Cells[2].Text.ToString();
            Application["ProductId"] = id;

            GridView1.EditIndex = e.NewEditIndex;
            var datalist = client.GetProducts(0);
            GridView1.DataSource = datalist;
            GridView1.DataBind();
            Label1.Text = "Editing mode"+" "+id;
            


        }

        protected void GridView1_RowCancelingEdit(object sender, GridViewCancelEditEventArgs e)
        {
            GridView1.EditIndex = -1;
            var datalist = client.GetProducts(0);
            GridView1.DataSource = datalist;
            GridView1.DataBind();
            Label1.Text = "Cancelled edit";

        }

        protected void GridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
        {
            GridViewRow row = (GridViewRow)GridView1.Rows[e.RowIndex];
            TableCell cell = row.Cells[2];
            Label1.Text = cell.Text;
            int id = Convert.ToInt32(cell.Text);
            client.DeleteProduct(id);
            var datalist = client.GetProducts(0);
            GridView1.DataSource = datalist;
            GridView1.DataBind();
            


        }

        protected void GridView1_RowUpdated(object sender, GridViewUpdatedEventArgs e)
        {
            

        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            
            if (TextBox1.Text.Equals("") || TextBox1.Text.Equals(null))
            {
                var datalist = client.GetProducts(0);
                GridView1.DataSource = datalist;
                GridView1.DataBind();
            }
            else
            {
                var product = client.GetProductWithName(TextBox1.Text);
                List<ServiceReference.Product> list = new List<ServiceReference.Product>();
                list.Add(product);
                GridView1.DataSource = list;
                GridView1.DataBind();
            }
        }
    }
}