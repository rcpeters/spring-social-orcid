//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.social.orcid.jaxb.beans.WorkExternalIdentifier;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workExternalIdentifierType",
    "workExternalIdentifierId"
})
@XmlRootElement(name = "work-external-identifier")
public class WorkExternalIdentifierImpl
    implements WorkExternalIdentifier
{

    @XmlElement(name = "work-external-identifier-type", required = true)
    protected String workExternalIdentifierType;
    @XmlElement(name = "work-external-identifier-id", required = true)
    protected String workExternalIdentifierId;

    public String getWorkExternalIdentifierType() {
        return workExternalIdentifierType;
    }

    public void setWorkExternalIdentifierType(String value) {
        this.workExternalIdentifierType = value;
    }

    public String getWorkExternalIdentifierId() {
        return workExternalIdentifierId;
    }

    public void setWorkExternalIdentifierId(String value) {
        this.workExternalIdentifierId = value;
    }

}