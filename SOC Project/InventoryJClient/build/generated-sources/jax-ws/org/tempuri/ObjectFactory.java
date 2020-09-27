
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.inventoryservice.ArrayOfProduct;
import org.datacontract.schemas._2004._07.inventoryservice.Product;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "GetProductsResult");
    private final static QName _GetProductWithNameName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _GetProductWithNameResponseGetProductWithNameResult_QNAME = new QName("http://tempuri.org/", "GetProductWithNameResult");
    private final static QName _GetProductWithIdResponseGetProductWithIdResult_QNAME = new QName("http://tempuri.org/", "GetProductWithIdResult");
    private final static QName _GetProductsOfCategoryCategory_QNAME = new QName("http://tempuri.org/", "category");
    private final static QName _GetProductsOfCategoryResponseGetProductsOfCategoryResult_QNAME = new QName("http://tempuri.org/", "GetProductsOfCategoryResult");
    private final static QName _AddProductName_QNAME = new QName("http://tempuri.org/", "Name");
    private final static QName _AddProductCategory_QNAME = new QName("http://tempuri.org/", "Category");
    private final static QName _AddProductResponseAddProductResult_QNAME = new QName("http://tempuri.org/", "AddProductResult");
    private final static QName _UpdateStockResponseUpdateStockResult_QNAME = new QName("http://tempuri.org/", "UpdateStockResult");
    private final static QName _UpdatePriceResponseUpdatePriceResult_QNAME = new QName("http://tempuri.org/", "UpdatePriceResult");
    private final static QName _UpdateNameResponseUpdateNameResult_QNAME = new QName("http://tempuri.org/", "UpdateNameResult");
    private final static QName _DeleteProductResponseDeleteProductResult_QNAME = new QName("http://tempuri.org/", "DeleteProductResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductWithName }
     * 
     */
    public GetProductWithName createGetProductWithName() {
        return new GetProductWithName();
    }

    /**
     * Create an instance of {@link GetProductWithNameResponse }
     * 
     */
    public GetProductWithNameResponse createGetProductWithNameResponse() {
        return new GetProductWithNameResponse();
    }

    /**
     * Create an instance of {@link GetProductWithId }
     * 
     */
    public GetProductWithId createGetProductWithId() {
        return new GetProductWithId();
    }

    /**
     * Create an instance of {@link GetProductWithIdResponse }
     * 
     */
    public GetProductWithIdResponse createGetProductWithIdResponse() {
        return new GetProductWithIdResponse();
    }

    /**
     * Create an instance of {@link GetProductsOfCategory }
     * 
     */
    public GetProductsOfCategory createGetProductsOfCategory() {
        return new GetProductsOfCategory();
    }

    /**
     * Create an instance of {@link GetProductsOfCategoryResponse }
     * 
     */
    public GetProductsOfCategoryResponse createGetProductsOfCategoryResponse() {
        return new GetProductsOfCategoryResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link UpdateStock }
     * 
     */
    public UpdateStock createUpdateStock() {
        return new UpdateStock();
    }

    /**
     * Create an instance of {@link UpdateStockResponse }
     * 
     */
    public UpdateStockResponse createUpdateStockResponse() {
        return new UpdateStockResponse();
    }

    /**
     * Create an instance of {@link UpdatePrice }
     * 
     */
    public UpdatePrice createUpdatePrice() {
        return new UpdatePrice();
    }

    /**
     * Create an instance of {@link UpdatePriceResponse }
     * 
     */
    public UpdatePriceResponse createUpdatePriceResponse() {
        return new UpdatePriceResponse();
    }

    /**
     * Create an instance of {@link UpdateName }
     * 
     */
    public UpdateName createUpdateName() {
        return new UpdateName();
    }

    /**
     * Create an instance of {@link UpdateNameResponse }
     * 
     */
    public UpdateNameResponse createUpdateNameResponse() {
        return new UpdateNameResponse();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetProductsResponseGetProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfProduct.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = GetProductWithName.class)
    public JAXBElement<String> createGetProductWithNameName(String value) {
        return new JAXBElement<String>(_GetProductWithNameName_QNAME, String.class, GetProductWithName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductWithNameResult", scope = GetProductWithNameResponse.class)
    public JAXBElement<Product> createGetProductWithNameResponseGetProductWithNameResult(Product value) {
        return new JAXBElement<Product>(_GetProductWithNameResponseGetProductWithNameResult_QNAME, Product.class, GetProductWithNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductWithIdResult", scope = GetProductWithIdResponse.class)
    public JAXBElement<Product> createGetProductWithIdResponseGetProductWithIdResult(Product value) {
        return new JAXBElement<Product>(_GetProductWithIdResponseGetProductWithIdResult_QNAME, Product.class, GetProductWithIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "category", scope = GetProductsOfCategory.class)
    public JAXBElement<String> createGetProductsOfCategoryCategory(String value) {
        return new JAXBElement<String>(_GetProductsOfCategoryCategory_QNAME, String.class, GetProductsOfCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsOfCategoryResult", scope = GetProductsOfCategoryResponse.class)
    public JAXBElement<ArrayOfProduct> createGetProductsOfCategoryResponseGetProductsOfCategoryResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetProductsOfCategoryResponseGetProductsOfCategoryResult_QNAME, ArrayOfProduct.class, GetProductsOfCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddProduct.class)
    public JAXBElement<String> createAddProductName(String value) {
        return new JAXBElement<String>(_AddProductName_QNAME, String.class, AddProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Category", scope = AddProduct.class)
    public JAXBElement<String> createAddProductCategory(String value) {
        return new JAXBElement<String>(_AddProductCategory_QNAME, String.class, AddProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddProductResult", scope = AddProductResponse.class)
    public JAXBElement<String> createAddProductResponseAddProductResult(String value) {
        return new JAXBElement<String>(_AddProductResponseAddProductResult_QNAME, String.class, AddProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateStockResult", scope = UpdateStockResponse.class)
    public JAXBElement<String> createUpdateStockResponseUpdateStockResult(String value) {
        return new JAXBElement<String>(_UpdateStockResponseUpdateStockResult_QNAME, String.class, UpdateStockResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdatePriceResult", scope = UpdatePriceResponse.class)
    public JAXBElement<String> createUpdatePriceResponseUpdatePriceResult(String value) {
        return new JAXBElement<String>(_UpdatePriceResponseUpdatePriceResult_QNAME, String.class, UpdatePriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = UpdateName.class)
    public JAXBElement<String> createUpdateNameName(String value) {
        return new JAXBElement<String>(_AddProductName_QNAME, String.class, UpdateName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateNameResult", scope = UpdateNameResponse.class)
    public JAXBElement<String> createUpdateNameResponseUpdateNameResult(String value) {
        return new JAXBElement<String>(_UpdateNameResponseUpdateNameResult_QNAME, String.class, UpdateNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteProductResult", scope = DeleteProductResponse.class)
    public JAXBElement<String> createDeleteProductResponseDeleteProductResult(String value) {
        return new JAXBElement<String>(_DeleteProductResponseDeleteProductResult_QNAME, String.class, DeleteProductResponse.class, value);
    }

}
