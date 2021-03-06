﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace InventoryClient.ServiceReference {
    using System.Runtime.Serialization;
    using System;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Product", Namespace="http://schemas.datacontract.org/2004/07/InventoryService")]
    [System.SerializableAttribute()]
    public partial class Product : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string CategoryField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int IdField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string NameField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private decimal PriceField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int StockField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string Category {
            get {
                return this.CategoryField;
            }
            set {
                if ((object.ReferenceEquals(this.CategoryField, value) != true)) {
                    this.CategoryField = value;
                    this.RaisePropertyChanged("Category");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int Id {
            get {
                return this.IdField;
            }
            set {
                if ((this.IdField.Equals(value) != true)) {
                    this.IdField = value;
                    this.RaisePropertyChanged("Id");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string Name {
            get {
                return this.NameField;
            }
            set {
                if ((object.ReferenceEquals(this.NameField, value) != true)) {
                    this.NameField = value;
                    this.RaisePropertyChanged("Name");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public decimal Price {
            get {
                return this.PriceField;
            }
            set {
                if ((this.PriceField.Equals(value) != true)) {
                    this.PriceField = value;
                    this.RaisePropertyChanged("Price");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int Stock {
            get {
                return this.StockField;
            }
            set {
                if ((this.StockField.Equals(value) != true)) {
                    this.StockField = value;
                    this.RaisePropertyChanged("Stock");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="ServiceReference.InventoryInterface")]
    public interface InventoryInterface {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProducts", ReplyAction="http://tempuri.org/InventoryInterface/GetProductsResponse")]
        InventoryClient.ServiceReference.Product[] GetProducts(int value);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProducts", ReplyAction="http://tempuri.org/InventoryInterface/GetProductsResponse")]
        System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product[]> GetProductsAsync(int value);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProductWithName", ReplyAction="http://tempuri.org/InventoryInterface/GetProductWithNameResponse")]
        InventoryClient.ServiceReference.Product GetProductWithName(string name);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProductWithName", ReplyAction="http://tempuri.org/InventoryInterface/GetProductWithNameResponse")]
        System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product> GetProductWithNameAsync(string name);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProductWithId", ReplyAction="http://tempuri.org/InventoryInterface/GetProductWithIdResponse")]
        InventoryClient.ServiceReference.Product GetProductWithId(int id);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProductWithId", ReplyAction="http://tempuri.org/InventoryInterface/GetProductWithIdResponse")]
        System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product> GetProductWithIdAsync(int id);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProductsOfCategory", ReplyAction="http://tempuri.org/InventoryInterface/GetProductsOfCategoryResponse")]
        InventoryClient.ServiceReference.Product[] GetProductsOfCategory(string category);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/GetProductsOfCategory", ReplyAction="http://tempuri.org/InventoryInterface/GetProductsOfCategoryResponse")]
        System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product[]> GetProductsOfCategoryAsync(string category);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/AddProduct", ReplyAction="http://tempuri.org/InventoryInterface/AddProductResponse")]
        string AddProduct(string Name, decimal Price, int Stock, string Category);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/AddProduct", ReplyAction="http://tempuri.org/InventoryInterface/AddProductResponse")]
        System.Threading.Tasks.Task<string> AddProductAsync(string Name, decimal Price, int Stock, string Category);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/UpdateStock", ReplyAction="http://tempuri.org/InventoryInterface/UpdateStockResponse")]
        string UpdateStock(int Id, int Stock);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/UpdateStock", ReplyAction="http://tempuri.org/InventoryInterface/UpdateStockResponse")]
        System.Threading.Tasks.Task<string> UpdateStockAsync(int Id, int Stock);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/UpdatePrice", ReplyAction="http://tempuri.org/InventoryInterface/UpdatePriceResponse")]
        string UpdatePrice(int Id, decimal Price);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/UpdatePrice", ReplyAction="http://tempuri.org/InventoryInterface/UpdatePriceResponse")]
        System.Threading.Tasks.Task<string> UpdatePriceAsync(int Id, decimal Price);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/UpdateName", ReplyAction="http://tempuri.org/InventoryInterface/UpdateNameResponse")]
        string UpdateName(int Id, string Name);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/UpdateName", ReplyAction="http://tempuri.org/InventoryInterface/UpdateNameResponse")]
        System.Threading.Tasks.Task<string> UpdateNameAsync(int Id, string Name);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/DeleteProduct", ReplyAction="http://tempuri.org/InventoryInterface/DeleteProductResponse")]
        string DeleteProduct(int id);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/InventoryInterface/DeleteProduct", ReplyAction="http://tempuri.org/InventoryInterface/DeleteProductResponse")]
        System.Threading.Tasks.Task<string> DeleteProductAsync(int id);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface InventoryInterfaceChannel : InventoryClient.ServiceReference.InventoryInterface, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class InventoryInterfaceClient : System.ServiceModel.ClientBase<InventoryClient.ServiceReference.InventoryInterface>, InventoryClient.ServiceReference.InventoryInterface {
        
        public InventoryInterfaceClient() {
        }
        
        public InventoryInterfaceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public InventoryInterfaceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public InventoryInterfaceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public InventoryInterfaceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public InventoryClient.ServiceReference.Product[] GetProducts(int value) {
            return base.Channel.GetProducts(value);
        }
        
        public System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product[]> GetProductsAsync(int value) {
            return base.Channel.GetProductsAsync(value);
        }
        
        public InventoryClient.ServiceReference.Product GetProductWithName(string name) {
            return base.Channel.GetProductWithName(name);
        }
        
        public System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product> GetProductWithNameAsync(string name) {
            return base.Channel.GetProductWithNameAsync(name);
        }
        
        public InventoryClient.ServiceReference.Product GetProductWithId(int id) {
            return base.Channel.GetProductWithId(id);
        }
        
        public System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product> GetProductWithIdAsync(int id) {
            return base.Channel.GetProductWithIdAsync(id);
        }
        
        public InventoryClient.ServiceReference.Product[] GetProductsOfCategory(string category) {
            return base.Channel.GetProductsOfCategory(category);
        }
        
        public System.Threading.Tasks.Task<InventoryClient.ServiceReference.Product[]> GetProductsOfCategoryAsync(string category) {
            return base.Channel.GetProductsOfCategoryAsync(category);
        }
        
        public string AddProduct(string Name, decimal Price, int Stock, string Category) {
            return base.Channel.AddProduct(Name, Price, Stock, Category);
        }
        
        public System.Threading.Tasks.Task<string> AddProductAsync(string Name, decimal Price, int Stock, string Category) {
            return base.Channel.AddProductAsync(Name, Price, Stock, Category);
        }
        
        public string UpdateStock(int Id, int Stock) {
            return base.Channel.UpdateStock(Id, Stock);
        }
        
        public System.Threading.Tasks.Task<string> UpdateStockAsync(int Id, int Stock) {
            return base.Channel.UpdateStockAsync(Id, Stock);
        }
        
        public string UpdatePrice(int Id, decimal Price) {
            return base.Channel.UpdatePrice(Id, Price);
        }
        
        public System.Threading.Tasks.Task<string> UpdatePriceAsync(int Id, decimal Price) {
            return base.Channel.UpdatePriceAsync(Id, Price);
        }
        
        public string UpdateName(int Id, string Name) {
            return base.Channel.UpdateName(Id, Name);
        }
        
        public System.Threading.Tasks.Task<string> UpdateNameAsync(int Id, string Name) {
            return base.Channel.UpdateNameAsync(Id, Name);
        }
        
        public string DeleteProduct(int id) {
            return base.Channel.DeleteProduct(id);
        }
        
        public System.Threading.Tasks.Task<string> DeleteProductAsync(int id) {
            return base.Channel.DeleteProductAsync(id);
        }
    }
}
