
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 'isDeletedObject' operation. It contains an element
 *                 holding an array of responses.
 *                 @responses        -  An array of responses of type
 *                 AgileIsDeletedObjectResponse    
 * 
 * <p>Java class for IsDeletedObjectResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsDeletedObjectResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileIsDeletedObjectResponse" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsDeletedObjectResponseType", propOrder = {
    "responses"
})
public class IsDeletedObjectResponseType
    extends AbstractResponseType
{

    @XmlElement(required = true)
    protected List<AgileIsDeletedObjectResponse> responses;

    /**
     * Gets the value of the responses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileIsDeletedObjectResponse }
     * 
     * 
     */
    public List<AgileIsDeletedObjectResponse> getResponses() {
        if (responses == null) {
            responses = new ArrayList<AgileIsDeletedObjectResponse>();
        }
        return this.responses;
    }

}
