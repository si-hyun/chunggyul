package com.hack.greenmandarine.dto;

public class UserBehaviorDto {
	
	private double nb_u_time;
	private double com_fee_dly_cnt;
	private double sns_friend_cnt;
	private double email_chck_ratio;
	private double avg_grade;
	private double m_search_cnt_avg;
	private double sns_upload_cnt;
	private double p_test_score;
	
	
	
	public double getNb_u_time() {
		return nb_u_time;
	}



	public void setNb_u_time(double nb_u_time) {
		this.nb_u_time = nb_u_time;
	}



	public double getCom_fee_dly_cnt() {
		return com_fee_dly_cnt;
	}



	public void setCom_fee_dly_cnt(double com_fee_dly_cnt) {
		this.com_fee_dly_cnt = com_fee_dly_cnt;
	}



	public double getSns_friend_cnt() {
		return sns_friend_cnt;
	}



	public void setSns_friend_cnt(double sns_friend_cnt) {
		this.sns_friend_cnt = sns_friend_cnt;
	}



	public double getEmail_chck_ratio() {
		return email_chck_ratio;
	}



	public void setEmail_chck_ratio(double email_chck_ratio) {
		this.email_chck_ratio = email_chck_ratio;
	}



	public double getAvg_grade() {
		return avg_grade;
	}



	public void setAvg_grade(double avg_grade) {
		this.avg_grade = avg_grade;
	}



	public double getM_search_cnt_avg() {
		return m_search_cnt_avg;
	}



	public void setM_search_cnt_avg(double m_search_cnt_avg) {
		this.m_search_cnt_avg = m_search_cnt_avg;
	}



	public double getSns_upload_cnt() {
		return sns_upload_cnt;
	}



	public void setSns_upload_cnt(double sns_upload_cnt) {
		this.sns_upload_cnt = sns_upload_cnt;
	}



	public double getP_test_score() {
		return p_test_score;
	}



	public void setP_test_score(double p_test_score) {
		this.p_test_score = p_test_score;
	}



	public UserBehaviorDto() {
		
	}



	public UserBehaviorDto(double nb_u_time, double com_fee_dly_cnt, double sns_friend_cnt, double email_chck_ratio,
			double avg_grade, double m_search_cnt_avg, double sns_upload_cnt, double p_test_score) {
		super();
		this.nb_u_time = nb_u_time;
		this.com_fee_dly_cnt = com_fee_dly_cnt;
		this.sns_friend_cnt = sns_friend_cnt;
		this.email_chck_ratio = email_chck_ratio;
		this.avg_grade = avg_grade;
		this.m_search_cnt_avg = m_search_cnt_avg;
		this.sns_upload_cnt = sns_upload_cnt;
		this.p_test_score = p_test_score;
	}

	
	
}
