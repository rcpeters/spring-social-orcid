//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.social.orcid.jaxb.beans.FundingExternalIdentifier;
import org.springframework.social.orcid.jaxb.beans.FundingExternalIdentifiers;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fundingExternalIdentifiers"
})
@XmlRootElement(name = "funding-external-identifiers")
public class FundingExternalIdentifiersImpl
    implements FundingExternalIdentifiers
{

    @XmlElement(name = "funding-external-identifier", type = FundingExternalIdentifierImpl.class)
    protected List<FundingExternalIdentifier> fundingExternalIdentifiers;

    public List<FundingExternalIdentifier> getFundingExternalIdentifiers() {
        if (fundingExternalIdentifiers == null) {
            fundingExternalIdentifiers = new ArrayList<FundingExternalIdentifier>();
        }
        return this.fundingExternalIdentifiers;
    }

}
