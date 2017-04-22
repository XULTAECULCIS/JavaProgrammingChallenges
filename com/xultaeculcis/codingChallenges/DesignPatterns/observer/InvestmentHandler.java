package com.xultaeculcis.codingChallenges.DesignPatterns.observer;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class InvestmentHandler implements Observer {

	Subject stockData = null;
	
	public InvestmentHandler(Subject stockData) {
		this.stockData = stockData;
		stockData.addObserver(this);
	}
	
	@Override
	public void update(String stockSymbol, Float stockValue, Integer stockUnits) {
		System.out.println("InvestmentHandler received changes... ");
	}

}
