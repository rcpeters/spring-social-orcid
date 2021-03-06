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

import org.springframework.social.orcid.jaxb.beans.CreditName;
import org.springframework.social.orcid.jaxb.beans.OtherNames;
import org.springframework.social.orcid.jaxb.beans.PersonalDetails;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "givenNames",
    "familyName",
    "creditName",
    "otherNames"
})
@XmlRootElement(name = "personal-details")
public class PersonalDetailsImpl
    implements PersonalDetails
{

    @XmlElement(name = "given-names", required = true)
    protected String givenNames;
    @XmlElement(name = "family-name")
    protected String familyName;
    @XmlElement(name = "credit-name", type = CreditNameImpl.class)
    protected CreditNameImpl creditName;
    @XmlElement(name = "other-names", type = OtherNamesImpl.class)
    protected OtherNamesImpl otherNames;

    public String getGivenNames() {
        return givenNames;
    }

    public void setGivenNames(String value) {
        this.givenNames = value;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String value) {
        this.familyName = value;
    }

    public CreditName getCreditName() {
        return creditName;
    }

    public void setCreditName(CreditName value) {
        this.creditName = ((CreditNameImpl) value);
    }

    public OtherNames getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(OtherNames value) {
        this.otherNames = ((OtherNamesImpl) value);
    }

}
