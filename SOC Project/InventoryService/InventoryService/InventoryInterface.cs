using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Data;
namespace InventoryService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "InventoryInterface" in both code and config file together.
    [ServiceContract]
    public interface InventoryInterface
    {
        //GET
        [OperationContract]
        List<Product> GetProducts(int value);

        [OperationContract]
        Product GetProductWithName(string name);

        [OperationContract]
        Product GetProductWithId(int id);

        [OperationContract]
        List<Product> GetProductsOfCategory(string category);
        //POST
        [OperationContract]
        string AddProduct(string Name, decimal Price, int Stock, string Category);
        //PUT
        [OperationContract]
        string UpdateStock(int Id,int Stock);

        [OperationContract]
        string UpdatePrice(int Id, decimal Price);

        [OperationContract]
        string UpdateName(int Id, string Name);
        //DELETE
        [OperationContract]
        string DeleteProduct(int id);



        // TODO: Add your service operations here
    }

    // Use a data contract as illustrated in the sample below to add composite types to service operations.
    // You can add XSD files into the project. After building the project, you can directly use the data types defined there, with the namespace "InventoryService.ContractType".
    [DataContract]
    public class Product
    {

        int id;
        string name;
        decimal price;
        int stock;
        string category;
        

        [DataMember]
        public int Id {
            get { return id; }
            set { id = value; }
        }
        [DataMember]
        public string Name {
            get { return name; }
            set { name = value; }
        }
        [DataMember]
        public decimal Price {
            get { return price; }
            set { price = value; }
        }
        [DataMember]
        public int Stock {
            get { return stock; }
            set { stock = value; }
        }
        [DataMember]
        public string Category {
            get { return category; }
            set { category = value; }
        }
        


    }
    
}
