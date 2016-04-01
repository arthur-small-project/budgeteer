package com.arthurdkid.financialadvisor.models;

import java.io.Serializable;

/**
 * This is not directly connected to any of user's bank accounts 
 * or piggy banks or wallet. This is merely an 
 * estimation/expectation of how much money was saved.
 *   
 * @author ArthurDKid
 */
public class PiggyBank implements Serializable {
	
	private static final long serialVersionUID = 6173155961340607763L;
	
	String piggyDescription;
	double amountSaved;
	
	public String getPiggyDescription() {
		return piggyDescription;
	}
	public void setPiggyDescription(String piggyDescription) {
		this.piggyDescription = piggyDescription;
	}
	public double getAmountSaved() {
		return amountSaved;
	}
	public void setAmountSaved(double amountSaved) {
		this.amountSaved = amountSaved;
	}
}
