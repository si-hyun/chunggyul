package com.hack.greenmandarine.dto;

public class LoanDto {
	
	private String company_code;
	private String product_code;
	private String cb_name;
	private String grade_1;
	private String grade_4;
	private String grade_5;
	private String grade_6;
	private String grade_10;
	private String grade_11;
	private String grade_12;
	private String grade_13;
	private String grade_avg;
	private int gm_limit;
	private int nice_limit;
	private int kcb_limit;
	
	
	
	public String getCompany_code() {
		return company_code;
	}



	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}



	public String getProduct_code() {
		return product_code;
	}



	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}



	public String getCb_name() {
		return cb_name;
	}



	public void setCb_name(String cb_name) {
		this.cb_name = cb_name;
	}



	public String getGrade_1() {
		return grade_1;
	}



	public void setGrade_1(String grade_1) {
		this.grade_1 = grade_1;
	}



	public String getGrade_4() {
		return grade_4;
	}



	public void setGrade_4(String grade_4) {
		this.grade_4 = grade_4;
	}



	public String getGrade_5() {
		return grade_5;
	}



	public void setGrade_5(String grade_5) {
		this.grade_5 = grade_5;
	}



	public String getGrade_6() {
		return grade_6;
	}



	public void setGrade_6(String grade_6) {
		this.grade_6 = grade_6;
	}



	public String getGrade_10() {
		return grade_10;
	}



	public void setGrade_10(String grade_10) {
		this.grade_10 = grade_10;
	}



	public String getGrade_11() {
		return grade_11;
	}



	public void setGrade_11(String grade_11) {
		this.grade_11 = grade_11;
	}



	public String getGrade_12() {
		return grade_12;
	}



	public void setGrade_12(String grade_12) {
		this.grade_12 = grade_12;
	}



	public String getGrade_13() {
		return grade_13;
	}



	public void setGrade_13(String grade_13) {
		this.grade_13 = grade_13;
	}



	public String getGrade_avg() {
		return grade_avg;
	}



	public void setGrade_avg(String grade_avg) {
		this.grade_avg = grade_avg;
	}



	public int getGm_limit() {
		return gm_limit;
	}



	public void setGm_limit(int gm_limit) {
		this.gm_limit = gm_limit;
	}



	public int getNice_limit() {
		return nice_limit;
	}



	public void setNice_limit(int nice_limit) {
		this.nice_limit = nice_limit;
	}



	public int getKcb_limit() {
		return kcb_limit;
	}



	public void setKcb_limit(int kcb_limit) {
		this.kcb_limit = kcb_limit;
	}



	public LoanDto() {
		
	}



	public LoanDto(String company_code, String product_code, String cb_name, String grade_1, String grade_4,
			String grade_5, String grade_6, String grade_10, String grade_11, String grade_12, String grade_13,
			String grade_avg, int gm_limit, int nice_limit, int kcb_limit) {
		super();
		this.company_code = company_code;
		this.product_code = product_code;
		this.cb_name = cb_name;
		this.grade_1 = grade_1;
		this.grade_4 = grade_4;
		this.grade_5 = grade_5;
		this.grade_6 = grade_6;
		this.grade_10 = grade_10;
		this.grade_11 = grade_11;
		this.grade_12 = grade_12;
		this.grade_13 = grade_13;
		this.grade_avg = grade_avg;
		this.gm_limit = gm_limit;
		this.nice_limit = nice_limit;
		this.kcb_limit = kcb_limit;
	}
	
	
}
