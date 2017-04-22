package com.xultaeculcis.codingChallenges.DesignPatterns.observer;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class StockBroker {
	
	public static void main(String args[]) {
		
		// Initialize Subject
		StockData stockData = new StockData();
		
		// Initialize Observers
		Observer incomeHandler = new IncomeHandler(stockData);
		Observer investmentHandler = new InvestmentHandler(stockData);
		Observer portfolioHandler = new PortfolioHandler(stockData);
		
		// Put it to work
		stockData.setStockData("ABCD", 489.50f, 10000);
		stockData.setStockData("EFGH", 231.25f, 1000000);
		stockData.setStockData("IJKL", 9.63f, 2500000);
	}

}
