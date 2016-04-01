package com.arthurdkid.financialadvisor.models;

/**
 * Money that makes the wallet cry.
 * This also include taxes and other expenditures.
 * 
 * Added Budget Category as part of Expense to track down
 * the budget.
 * 
 * @author ArthurDKid
 */

public class Expense extends Money{
	
	private static final long serialVersionUID = 2064638678522466452L;
	
	int budgetCategoryID;
	
	public int getBudgetCategoryID() {
		return budgetCategoryID;
	}
	/**
	 * sets the budget category to where the expense should belong.
	 * If the expense is not categorized to any of the budgets defined by user,
	 * set it to -1.
	 * @param budgetCategoryID
	 */
	public void setBudgetCategoryID(int budgetCategoryID) {
		this.budgetCategoryID = budgetCategoryID;
	}
}
