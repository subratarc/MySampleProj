package com.my.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "emp", catalog = "testDB", uniqueConstraints = {
		@UniqueConstraint(columnNames = "DNAME") })

public class Emp implements java.io.Serializable {

	private Integer empId;
	private String dName;
	private String eName;

	public Emp() {
	}

	public Emp(String dName, String eName) {
		this.dName = dName;
		this.eName = eName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EMP_ID", unique = true, nullable = false)
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "DNAME", unique = true, nullable = false, length = 10)
	public String getDName() {
		return this.dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	@Column(name = "ENAME", nullable = false, length = 20)
	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Stock [dName=" + dName + ", empId=" + empId
				+ ", eName=" + eName + "]";
	}
}