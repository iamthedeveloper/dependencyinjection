package com.kranti.di.service;

public class MasterCard implements CardIssueService {

	@Override
	public Boolean issueCard() {
		System.out.println("Issued Master Card!");
		return true;
	}

}
