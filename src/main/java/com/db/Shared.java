package com.db;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;
import com.agile.ws.schema.common.v1.jaxws.AgileMoneyType;
import com.agile.ws.schema.common.v1.jaxws.SelectionType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Shared {
	
	
    public static String getMessageElementValue( Element element) {
        SelectionType selection;
        if (element.getFirstChild() != null) {

            if (element.getAttribute("xsi:type").contains("AgileListEntryType")) {
                AgileListEntryType list = (AgileListEntryType) unmarshalToAgileListEntryType(element);
                if (list != null) {
                    if (list.getSelection().size() != 0) {
                        selection = list.getSelection().get(0);
                        return selection.getValue();
                    }
                }
            } else if (element.getAttribute("xsi:type").contains("AgileMoneyType")) {
                AgileMoneyType money = (AgileMoneyType) unmarshalToAgileMoneyType(element);
                if (money != null) {
                    return money.getAmount().toString();
                }
            } else
                return element.getFirstChild().getNodeValue();
        }
        return null;
    }
    
    public static Object unmarshalToAgileListEntryType ( Node node) {

        try {
            JAXBContext jc = null;
            Class<?> clz = null;

            String xsiType = ((Element)node).getAttributeNS("http://xmlns.oracle.com/AgileObjects/Core/Common/V1", "type");
            boolean isXSITypeEmpty = "".equals(xsiType) || null==xsiType ? true : false;

            jc = JAXBContext.newInstance(AgileListEntryType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Object obj = unmarshaller.unmarshal(node);
            JAXBElement<?> jaxbEle = (JAXBElement<?>) obj;

            return jaxbEle.getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Object unmarshalToAgileMoneyType (Node node) {

        try {
            JAXBContext jc = null;
            Class<?> clz = null;

            String xsiType = ((Element)node).getAttributeNS("http://xmlns.oracle.com/AgileObjects/Core/Common/V1", "type");
            boolean isXSITypeEmpty = "".equals(xsiType) || null==xsiType ? true : false;

            jc = JAXBContext.newInstance(AgileMoneyType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Object obj = unmarshaller.unmarshal(node);
            JAXBElement<?> jaxbEle = (JAXBElement<?>) obj;

            return jaxbEle.getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
