package com.arthurdkid.financialadvisor.models;

import java.io.Serializable;
import java.sql.Date;

/**
 * Money is anything that comes in and out of your wallet
 * which includes allowance, income, taxes, expenses and etc. 
 * 
 * @author ArthurDKid
 */

public class Money implements Serializable{

	private static final long serialVersionUID = 8262797217433566899L;

	double amount;
	Date dateEntered;
	String entryDescription;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}
	public String getEntryDescription() {
		return entryDescription;
	}
	public void setEntryDescription(String entryDescription) {
		this.entryDescription = entryDescription;
	}
}
