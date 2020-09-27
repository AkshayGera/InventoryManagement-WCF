
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.inventoryservice.ArrayOfProduct;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetProductsOfCategoryResult" type="{http://schemas.datacontract.org/2004/07/InventoryService}ArrayOfProduct" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProductsOfCategoryResult"
})
@XmlRootElement(name = "GetProductsOfCategoryResponse")
public class GetProductsOfCategoryResponse {

    @XmlElementRef(name = "GetProductsOfCategoryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProduct> getProductsOfCategoryResult;

    /**
     * Gets the value of the getProductsOfCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProduct> getGetProductsOfCategoryResult() {
        return getProductsOfCategoryResult;
    }

    /**
     * Sets the value of the getProductsOfCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public void setGetProductsOfCategoryResult(JAXBElement<ArrayOfProduct> value) {
        this.getProductsOfCategoryResult = value;
    }

}
