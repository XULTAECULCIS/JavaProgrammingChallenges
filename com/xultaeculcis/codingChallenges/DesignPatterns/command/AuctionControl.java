package com.xultaeculcis.codingChallenges.DesignPatterns.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class AuctionControl {
	Map<String, AuctionItem> auctionItems = new HashMap<String, AuctionItem>();
	public void setAuctionItem(String itemKey, AuctionItem auctionItem) {
		auctionItems.put(itemKey, auctionItem);
	}
	public void presentItem(String itemKey) {
		AuctionItem auctionItem = auctionItems.get(itemKey);
		auctionItem.sell();
	}
}