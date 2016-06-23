//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans;

import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-type"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}organization-defined-type" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-title"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}short-description" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}amount" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}url" minOccurs="0"/>
 *         &lt;element name="start-date" type="{http://www.orcid.org/ns/orcid}fuzzy-date" minOccurs="0"/>
 *         &lt;element name="end-date" type="{http://www.orcid.org/ns/orcid}fuzzy-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-external-identifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-contributors" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}organization"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}source" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}created-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}last-modified-date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Funding {


    /**
     * Gets the value of the fundingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFundingType();

    /**
     * Sets the value of the fundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFundingType(String value);

    /**
     * Gets the value of the organizationDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOrganizationDefinedType();

    /**
     * Sets the value of the organizationDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOrganizationDefinedType(String value);

    /**
     * Gets the value of the fundingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link FundingTitle }
     *     
     */
    FundingTitle getFundingTitle();

    /**
     * Sets the value of the fundingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTitle }
     *     
     */
    void setFundingTitle(FundingTitle value);

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getShortDescription();

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setShortDescription(String value);

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    Amount getAmount();

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    void setAmount(Amount value);

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    Url getUrl();

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    void setUrl(Url value);

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyDate }
     *     
     */
    FuzzyDate getStartDate();

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyDate }
     *     
     */
    void setStartDate(FuzzyDate value);

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyDate }
     *     
     */
    FuzzyDate getEndDate();

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyDate }
     *     
     */
    void setEndDate(FuzzyDate value);

    /**
     * Gets the value of the fundingExternalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link FundingExternalIdentifiers }
     *     
     */
    FundingExternalIdentifiers getFundingExternalIdentifiers();

    /**
     * Sets the value of the fundingExternalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingExternalIdentifiers }
     *     
     */
    void setFundingExternalIdentifiers(FundingExternalIdentifiers value);

    /**
     * Gets the value of the fundingContributors property.
     * 
     * @return
     *     possible object is
     *     {@link FundingContributors }
     *     
     */
    FundingContributors getFundingContributors();

    /**
     * Sets the value of the fundingContributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingContributors }
     *     
     */
    void setFundingContributors(FundingContributors value);

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    Organization getOrganization();

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    void setOrganization(Organization value);

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    Source getSource();

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    void setSource(Source value);

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link CreatedDate }
     *     
     */
    CreatedDate getCreatedDate();

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatedDate }
     *     
     */
    void setCreatedDate(CreatedDate value);

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link LastModifiedDate }
     *     
     */
    LastModifiedDate getLastModifiedDate();

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastModifiedDate }
     *     
     */
    void setLastModifiedDate(LastModifiedDate value);

    /**
     * Gets the value of the putCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getPutCode();

    /**
     * Sets the value of the putCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setPutCode(BigInteger value);

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    Visibility getVisibility();

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    void setVisibility(Visibility value);

}