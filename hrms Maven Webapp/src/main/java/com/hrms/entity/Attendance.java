package com.hrms.entity;

import java.sql.Timestamp;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */

public class Attendance implements java.io.Serializable {

	// Fields

	private Long id;
	private DataDictionary dataDictionary;
	private Staff staff;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Attendance() {
	}
	
//	@Override
//	public String toString() {
//		return "Attendance [id=" + id + ", staff=" + staff.getName() + ", time=" + time
//				+ "]";
//	}

	/** full constructor */
	public Attendance(DataDictionary dataDictionary, Staff staff, Timestamp time) {
		this.dataDictionary = dataDictionary;
		this.staff = staff;
		this.time = time;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}