
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.ObjectReferentIdType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for
 *                 'getBaselines' operation.              @baselines
 *                 -  List of baselines, which are of type
 *                 ProjectBaselineVersion.             @outputParameters -
 *                 Optional name,value pair for addressing future
 *                 requirements.             
 * 
 * <p>Java class for AgileGetBaselinesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetBaselinesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baselines" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectBaseline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectReferentIdType" minOccurs="0"/>
 *         &lt;element name="outputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileGetBaselinesResponseType", propOrder = {
    "baselines",
    "project",
    "outputParameters"
})
public class AgileGetBaselinesResponseType {

    @XmlElement(nillable = true)
    protected List<ProjectBaseline> baselines;
    @XmlElement(nillable = true)
    protected ObjectReferentIdType project;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the baselines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baselines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaselines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectBaseline }
     * 
     * 
     */
    public List<ProjectBaseline> getBaselines() {
        if (baselines == null) {
            baselines = new ArrayList<ProjectBaseline>();
        }
        return this.baselines;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public ObjectReferentIdType getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public void setProject(ObjectReferentIdType value) {
        this.project = value;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<PropertyListType>();
        }
        return this.outputParameters;
    }

}
