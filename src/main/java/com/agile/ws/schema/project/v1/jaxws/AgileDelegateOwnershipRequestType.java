
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'DelegateOwnership' web service are of
 *                 this type.                         This request
 *                 identifies the project to be delegated and the user to
 *                 whom the ownership                         is assigned.
 *                 @projectIdentifier  -   It is the unique Object number
 *                 which identifies a project
 *                 in the Agile system. Eg:- T00012
 *                 @userIdentifier     -   Refers to the user to whom
 *                 authority has to be delegated.
 *                 @applyToChildren    -   If this is set to true,
 *                 ownership will be delegated for the project's children
 *                 also                                     requirements
 *                 and any special handling.
 *                 @inputParameters     -  Optional name,value pair for
 *                 addressing future requirements.                                                         
 * 
 * <p>Java class for AgileDelegateOwnershipRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileDelegateOwnershipRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applyToChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileDelegateOwnershipRequestType", propOrder = {
    "projectIdentifier",
    "userIdentifier",
    "applyToChildren",
    "inputParameters"
})
public class AgileDelegateOwnershipRequestType {

    @XmlElement(required = true, nillable = true)
    protected String projectIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String userIdentifier;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean applyToChildren;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIdentifier(String value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the userIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentifier() {
        return userIdentifier;
    }

    /**
     * Sets the value of the userIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentifier(String value) {
        this.userIdentifier = value;
    }

    /**
     * Gets the value of the applyToChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Sets the value of the applyToChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToChildren(Boolean value) {
        this.applyToChildren = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<PropertyListType>();
        }
        return this.inputParameters;
    }

}
