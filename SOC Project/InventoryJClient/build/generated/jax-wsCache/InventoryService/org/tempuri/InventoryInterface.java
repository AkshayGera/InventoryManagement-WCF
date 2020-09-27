
package org.tempuri;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.inventoryservice.ArrayOfProduct;
import org.datacontract.schemas._2004._07.inventoryservice.Product;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InventoryInterface", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.inventoryservice.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface InventoryInterface {


    /**
     * 
     * @param value
     * @return
     *     returns org.datacontract.schemas._2004._07.inventoryservice.ArrayOfProduct
     */
    @WebMethod(operationName = "GetProducts", action = "http://tempuri.org/InventoryInterface/GetProducts")
    @WebResult(name = "GetProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProducts")
    @ResponseWrapper(localName = "GetProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductsResponse")
    public ArrayOfProduct getProducts(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        Integer value);

    /**
     * 
     * @param name
     * @return
     *     returns org.datacontract.schemas._2004._07.inventoryservice.Product
     */
    @WebMethod(operationName = "GetProductWithName", action = "http://tempuri.org/InventoryInterface/GetProductWithName")
    @WebResult(name = "GetProductWithNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProductWithName", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductWithName")
    @ResponseWrapper(localName = "GetProductWithNameResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductWithNameResponse")
    public Product getProductWithName(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param id
     * @return
     *     returns org.datacontract.schemas._2004._07.inventoryservice.Product
     */
    @WebMethod(operationName = "GetProductWithId", action = "http://tempuri.org/InventoryInterface/GetProductWithId")
    @WebResult(name = "GetProductWithIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProductWithId", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductWithId")
    @ResponseWrapper(localName = "GetProductWithIdResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductWithIdResponse")
    public Product getProductWithId(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param category
     * @return
     *     returns org.datacontract.schemas._2004._07.inventoryservice.ArrayOfProduct
     */
    @WebMethod(operationName = "GetProductsOfCategory", action = "http://tempuri.org/InventoryInterface/GetProductsOfCategory")
    @WebResult(name = "GetProductsOfCategoryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProductsOfCategory", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductsOfCategory")
    @ResponseWrapper(localName = "GetProductsOfCategoryResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductsOfCategoryResponse")
    public ArrayOfProduct getProductsOfCategory(
        @WebParam(name = "category", targetNamespace = "http://tempuri.org/")
        String category);

    /**
     * 
     * @param price
     * @param name
     * @param stock
     * @param category
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AddProduct", action = "http://tempuri.org/InventoryInterface/AddProduct")
    @WebResult(name = "AddProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddProduct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddProduct")
    @ResponseWrapper(localName = "AddProductResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddProductResponse")
    public String addProduct(
        @WebParam(name = "Name", targetNamespace = "http://tempuri.org/")
        String name,
        @WebParam(name = "Price", targetNamespace = "http://tempuri.org/")
        BigDecimal price,
        @WebParam(name = "Stock", targetNamespace = "http://tempuri.org/")
        Integer stock,
        @WebParam(name = "Category", targetNamespace = "http://tempuri.org/")
        String category);

    /**
     * 
     * @param id
     * @param stock
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateStock", action = "http://tempuri.org/InventoryInterface/UpdateStock")
    @WebResult(name = "UpdateStockResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateStock", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateStock")
    @ResponseWrapper(localName = "UpdateStockResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateStockResponse")
    public String updateStock(
        @WebParam(name = "Id", targetNamespace = "http://tempuri.org/")
        Integer id,
        @WebParam(name = "Stock", targetNamespace = "http://tempuri.org/")
        Integer stock);

    /**
     * 
     * @param price
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdatePrice", action = "http://tempuri.org/InventoryInterface/UpdatePrice")
    @WebResult(name = "UpdatePriceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdatePrice", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdatePrice")
    @ResponseWrapper(localName = "UpdatePriceResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdatePriceResponse")
    public String updatePrice(
        @WebParam(name = "Id", targetNamespace = "http://tempuri.org/")
        Integer id,
        @WebParam(name = "Price", targetNamespace = "http://tempuri.org/")
        BigDecimal price);

    /**
     * 
     * @param name
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateName", action = "http://tempuri.org/InventoryInterface/UpdateName")
    @WebResult(name = "UpdateNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateName", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateName")
    @ResponseWrapper(localName = "UpdateNameResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateNameResponse")
    public String updateName(
        @WebParam(name = "Id", targetNamespace = "http://tempuri.org/")
        Integer id,
        @WebParam(name = "Name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DeleteProduct", action = "http://tempuri.org/InventoryInterface/DeleteProduct")
    @WebResult(name = "DeleteProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteProduct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteProduct")
    @ResponseWrapper(localName = "DeleteProductResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteProductResponse")
    public String deleteProduct(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

}
