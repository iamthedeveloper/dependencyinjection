package com.kranti.di.injectors;

import com.kranti.di.consumer.CardServicesConsumer;
import com.kranti.di.service.VisaCard;

public class VisaCardInjector implements CardServiceInjector{

	@Override
	public CardServicesConsumer getServiceInjector() {
		return new CardServicesConsumer(new VisaCard());
	}



}
