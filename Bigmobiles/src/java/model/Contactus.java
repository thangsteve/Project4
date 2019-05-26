/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author An
 */
@Entity
@Table(name = "contactus", catalog = "bigmobiles", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactus.findAll", query = "SELECT c FROM Contactus c"),
    @NamedQuery(name = "Contactus.findByContactID", query = "SELECT c FROM Contactus c WHERE c.contactID = :contactID"),
    @NamedQuery(name = "Contactus.findByEmail", query = "SELECT c FROM Contactus c WHERE c.email = :email"),
    @NamedQuery(name = "Contactus.findByName", query = "SELECT c FROM Contactus c WHERE c.name = :name"),
    @NamedQuery(name = "Contactus.findByContent", query = "SELECT c FROM Contactus c WHERE c.content = :content"),
    @NamedQuery(name = "Contactus.findByCreateDate", query = "SELECT c FROM Contactus c WHERE c.createDate = :createDate")})
public class Contactus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID", nullable = false)
    private Integer contactID;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "Email", length = 2147483647)
    private String email;
    @Size(max = 50)
    @Column(name = "Name", length = 50)
    private String name;
    @Size(max = 2147483647)
    @Column(name = "Content", length = 2147483647)
    private String content;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    public Contactus() {
    }

    public Contactus(Integer contactID) {
        this.contactID = contactID;
    }

    public Integer getContactID() {
        return contactID;
    }

    public void setContactID(Integer contactID) {
        this.contactID = contactID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactID != null ? contactID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactus)) {
            return false;
        }
        Contactus other = (Contactus) object;
        if ((this.contactID == null && other.contactID != null) || (this.contactID != null && !this.contactID.equals(other.contactID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Contactus[ contactID=" + contactID + " ]";
    }
    
}
