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

import org.springframework.social.orcid.jaxb.beans.ScopePath;
import org.springframework.social.orcid.jaxb.beans.ScopePaths;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scopePaths"
})
@XmlRootElement(name = "scope-paths")
public class ScopePathsImpl
    implements ScopePaths
{

    @XmlElement(name = "scope-path", required = true, type = ScopePathImpl.class)
    protected List<ScopePath> scopePaths;

    public List<ScopePath> getScopePaths() {
        if (scopePaths == null) {
            scopePaths = new ArrayList<ScopePath>();
        }
        return this.scopePaths;
    }

}
