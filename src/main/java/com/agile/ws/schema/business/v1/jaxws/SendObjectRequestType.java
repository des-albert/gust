
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'sendObject' operation. It contains an array of requests
 *                 named requests to support batch operations.
 *                 @requests           -  An array of requests of type
 *                 AgileSendObjectRequest.
 *                 Details of the Agile object to be sent are specified
 *                 in these requests.                                     
 * 
 * <p>Java class for SendObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendObjectRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="requests" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileSendObjectRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendObjectRequestType", propOrder = {
    "requests"
})
public class SendObjectRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true)
    protected List<AgileSendObjectRequest> requests;

    /**
     * Gets the value of the requests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileSendObjectRequest }
     * 
     * 
     */
    public List<AgileSendObjectRequest> getRequests() {
        if (requests == null) {
            requests = new ArrayList<AgileSendObjectRequest>();
        }
        return this.requests;
    }

}