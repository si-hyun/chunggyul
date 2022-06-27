package com.hack.greenmandarine.dto;

import java.util.Date;

public class CustomerDto {

	private String customer_id;
	private String customer_pw;
	private String customer_name;
	private Date birth_date;
	private int age;
	private String thin_filer_type;
	private String email;
	private String phone;
	private String gm_yn;
	private int gm;
	private int nice;
	private int kcb;
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_pw() {
		return customer_pw;
	}
	public void setCustomer_pw(String customer_pw) {
		this.customer_pw = customer_pw;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getThin_filer_type() {
		return thin_filer_type;
	}
	public void setThin_filer_type(String thin_filer_type) {
		this.thin_filer_type = thin_filer_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGm_yn() {
		return gm_yn;
	}
	public void setGm_yn(String gm_yn) {
		this.gm_yn = gm_yn;
	}
	public int getGm() {
		return gm;
	}
	public void setGm(int gm) {
		this.gm = gm;
	}
	public int getNice() {
		return nice;
	}
	public void setNice(int nice) {
		this.nice = nice;
	}
	public int getKcb() {
		return kcb;
	}
	public void setKcb(int kcb) {
		this.kcb = kcb;
	}
	
	public CustomerDto() {
		
	}
	
	public CustomerDto(String customer_id, String customer_pw, String customer_name, Date birth_date, int age,
			String thin_filer_type, String email, String phone, String gm_yn, int gm, int nice, int kcb) {
		super();
		this.customer_id = customer_id;
		this.customer_pw = customer_pw;
		this.customer_name = customer_name;
		this.birth_date = birth_date;
		this.age = age;
		this.thin_filer_type = thin_filer_type;
		this.email = email;
		this.phone = phone;
		this.gm_yn = gm_yn;
		this.gm = gm;
		this.nice = nice;
		this.kcb = kcb;
	}

	


}
