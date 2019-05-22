
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 getAllReviewers operation. It contains an element
 *                 holding an array of responses.
 *                 @reviewersResponse    -  An array of responses of type
 *                 AgileGetAllReviewersResponseType   
 * 
 * <p>Java class for GetAllReviewersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllReviewersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="reviewersResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetAllReviewersResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllReviewersResponseType", propOrder = {
    "reviewersResponse"
})
public class GetAllReviewersResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetAllReviewersResponseType> reviewersResponse;

    /**
     * Gets the value of the reviewersResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewersResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewersResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetAllReviewersResponseType }
     * 
     * 
     */
    public List<AgileGetAllReviewersResponseType> getReviewersResponse() {
        if (reviewersResponse == null) {
            reviewersResponse = new ArrayList<AgileGetAllReviewersResponseType>();
        }
        return this.reviewersResponse;
    }

}
