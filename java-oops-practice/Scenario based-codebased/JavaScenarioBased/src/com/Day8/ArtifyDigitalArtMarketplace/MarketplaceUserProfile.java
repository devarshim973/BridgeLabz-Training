package com.Day8.ArtifyDigitalArtMarketplace;

public class MarketplaceUserProfile {
  private String name;
  private double walletBalance;
    
  public MarketplaceUserProfile(String name, double walletBalance) {
	  this.name=name;
	  this.walletBalance=walletBalance;
  }
  public String getName() {
	  return name;
	  
  }
  public double getWalletBalance() {
      return walletBalance;
  }
  
  public boolean deductAmount(double amount) {
	  if(walletBalance>=amount) {
		  walletBalance-=amount;
		  return true;
	  }
	  return false;
  }
}
