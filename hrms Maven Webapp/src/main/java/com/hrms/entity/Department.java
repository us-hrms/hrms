package com.hrms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Set staffMobilizationsForAfter = new HashSet(0);
	private Set staffMobilizationsForDefore = new HashSet(0);
	private Set positions = new HashSet(0);
	private Set staffs = new HashSet(0);
	private String principal;//部门负责人
	private int sum; //部门人数

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(String name) {
		this.name = name;
	}

	/** full constructor */
	public Department(String name, Set staffMobilizationsForAfter,
			Set staffMobilizationsForDefore, Set positions, Set staffs) {
		this.name = name;
		this.staffMobilizationsForAfter = staffMobilizationsForAfter;
		this.staffMobilizationsForDefore = staffMobilizationsForDefore;
		this.positions = positions;
		this.staffs = staffs;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getStaffMobilizationsForAfter() {
		return this.staffMobilizationsForAfter;
	}

	public void setStaffMobilizationsForAfter(Set staffMobilizationsForAfter) {
		this.staffMobilizationsForAfter = staffMobilizationsForAfter;
	}

	public Set getStaffMobilizationsForDefore() {
		return this.staffMobilizationsForDefore;
	}

	public void setStaffMobilizationsForDefore(Set staffMobilizationsForDefore) {
		this.staffMobilizationsForDefore = staffMobilizationsForDefore;
	}

	public Set getPositions() {
		return this.positions;
	}

	public void setPositions(Set positions) {
		this.positions = positions;
	}

	public Set getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set staffs) {
		this.staffs = staffs;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}