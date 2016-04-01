package com.arthurdkid.financialadvisor.models;

import java.io.Serializable;

/**
 * Categorizing budgets would help users see what 
 * expenses are needed and what other expenses they could
 * cut down in times of crisis or to achieve money goals.
 * 
 * @author ArthurDKid
 */

public class BudgetCategory implements Serializable{

	private static final long serialVersionUID = -3155514222017628438L;
	
	int UID;
	String budgetDescription;
	double budgetedAmount;
	boolean isOnBudget;
	
	public int getUID() {
		return UID;
	}
	public String getBudgetDescription() {
		return budgetDescription;
	}
	public void setBudgetDescription(String budgetDescription) {
		this.budgetDescription = budgetDescription;
	}
	public double getBudgetedAmount() {
		return budgetedAmount;
	}
	public void setBudgetedAmount(double budgetedAmount) {
		this.budgetedAmount = budgetedAmount;
	}
	public boolean isOnBudget() {
		return isOnBudget;
	}
	public void setOnBudget(boolean isStillOnBudget) {
		this.isOnBudget = isStillOnBudget;
	}
}
