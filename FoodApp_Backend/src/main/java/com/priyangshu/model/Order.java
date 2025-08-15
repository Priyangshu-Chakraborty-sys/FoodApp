package com.priyangshu.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="ordr_dtls")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer oid;
	@Column(length=10,nullable=false)
private String fid;
@CreationTimestamp
@Temporal(TemporalType.DATE)
private Date odt;
private Integer qty;
@Column(length=25,nullable=false)
private String uname;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Order(Integer oid, String fid, Date odt, Integer qty, String uname) {
	super();
	this.oid = oid;
	this.fid = fid;
	this.odt = odt;
	this.qty = qty;
	this.uname = uname;
}
public Integer getOid() {
	return oid;
}
public void setOid(Integer oid) {
	this.oid = oid;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public Date getOdt() {
	return odt;
}
public void setOdt(Date odt) {
	this.odt = odt;
}
public Integer getQty() {
	return qty;
}
public void setQty(Integer qty) {
	this.qty = qty;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
@Override
public String toString() {
	return "Order [oid=" + oid + ", fid=" + fid + ", odt=" + odt + ", qty=" + qty + ", uname=" + uname + "]";
}



}
