package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
//@NamedQuery( name = "v_name", query = "SELECT V_NAME FROM user_service.vendors WHERE V_ID=?")
@Entity
@Table(name = "vendors")
public class Vendor implements Serializable{
	@Id
	@Column(name = "v_id")
	private Integer vId;
	@Column(name = "v_name")
	private String vName;
	@Column(name="v_type")
	private String vtype;

	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vId;
		result = prime * result + ((vName == null) ? 0 : vName.hashCode());
		result = prime * result + ((vtype == null) ? 0 : vtype.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		if (vId != other.vId)
			return false;
		if (vName == null) {
			if (other.vName != null)
				return false;
		} else if (!vName.equals(other.vName))
			return false;
		if (vtype == null) {
			if (other.vtype != null)
				return false;
		} else if (!vtype.equals(other.vtype))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vendor [vId=" + vId + ", vName=" + vName + ", vtype=" + vtype + ", getvId()=" + getvId()
				+ ", getvName()=" + getvName() + ", getVtype()=" + getVtype() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
}
