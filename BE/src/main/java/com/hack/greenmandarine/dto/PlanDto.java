package com.hack.greenmandarine.dto;

public class PlanDto {
	
	private int target_money;
	private int current_saving;
	private int possible_save;
	private int loan_amount;
	
	public int getTarget_money() {
		return target_money;
	}

	public void setTarget_money(int target_money) {
		this.target_money = target_money;
	}

	public int getCurrent_saving() {
		return current_saving;
	}

	public void setCurrent_saving(int current_saving) {
		this.current_saving = current_saving;
	}

	public int getPossible_save() {
		return possible_save;
	}

	public void setPossible_save(int possible_save) {
		this.possible_save = possible_save;
	}

	public int getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}

	public PlanDto() {
		
	}

	public PlanDto(int target_money, int current_saving, int possible_save, int loan_amount) {
		super();
		this.target_money = target_money;
		this.current_saving = current_saving;
		this.possible_save = possible_save;
		this.loan_amount = loan_amount;
	}

}
