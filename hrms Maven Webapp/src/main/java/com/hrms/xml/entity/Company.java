package com.hrms.xml.entity;

import com.hrms.xml.uitl.Dom4jUtil;

public class Company {
	/*��˾���ƣ������ˣ����˴���������ҵ����˾��ַ���������룬���棬
	��˾��ַ����˾���䣬��˾�绰*/
	
	private String name;//��˾����
	private String responsible;//������
	private String legalPerson;//���˴���
	private String address;//��˾��ַ
	private String postalCode;//��������
	private String phone;//�绰
	private String email;//����
	
	public Company() {}
	
	public static Company readCompany() {
		return Dom4jUtil.readCompany();
	}
	public Company(String name, String responsible, String legalPerson,
			String address, String postalCode, String phone, String email) {
		super();
		this.name = name;
		this.responsible = responsible;
		this.legalPerson = legalPerson;
		this.address = address;
		this.postalCode = postalCode;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResponsible() {
		return responsible;
	}
	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
	public String getLegalPerson() {
		return legalPerson;
	}
	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", responsible=" + responsible
				+ ", legalPerson=" + legalPerson + ", address=" + address
				+ ", postalCode=" + postalCode + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
	
}
