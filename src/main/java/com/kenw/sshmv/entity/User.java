package com.kenw.sshmv.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_user", schema = "sshmv_db")
public class User implements java.io.Serializable {

    // Fields
    private Integer id;
    private String name;
    private String pwd;
    private Date createdatetime;
    private Date modifydatetime;

    // Constructors

    /** default constructor */
    public User() {
    }

    /** minimal constructor */
    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    /** full constructor */
    public User(Integer id, String name, String pwd, Date createdatetime, Date modifydatetime) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.createdatetime = createdatetime;
        this.modifydatetime = modifydatetime;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name",nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "pwd", nullable = false, length = 32)
    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdatetime", length = 7)
    public Date getCreatedatetime() {
        return this.createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modifydatetime", length = 7)
    public Date getModifydatetime() {
        return this.modifydatetime;
    }

    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }
}