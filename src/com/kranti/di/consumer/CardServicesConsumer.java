package com.kranti.di.consumer;

import com.kranti.di.service.CardIssueService;

public class CardServicesConsumer {

	CardIssueService service;
	public CardServicesConsumer(CardIssueService service) {
		this.service  = service;
	}
	
	public Boolean issueCard() {
		return service.issueCard();
	}
}
