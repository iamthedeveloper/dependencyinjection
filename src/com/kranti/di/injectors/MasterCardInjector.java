package com.kranti.di.injectors;

import com.kranti.di.consumer.CardServicesConsumer;
import com.kranti.di.service.MasterCard;

public class MasterCardInjector implements CardServiceInjector {

	@Override
	public CardServicesConsumer getServiceInjector() {
		return new CardServicesConsumer(new MasterCard()) ;
	}

}
