package com.kranti.di.service;

public class VisaCard implements CardIssueService {

	@Override
	public Boolean issueCard() {
		System.out.println("Issued Visa Card!");
		return true;
	}

}
