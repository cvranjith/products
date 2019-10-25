package com.ofss.products;

public class Product {

	String productID;
	String productDecription;
	String latestVersion;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productID, String productDecription, String latestVersion) {
		super();
		this.productID = productID;
		this.productDecription = productDecription;
		this.latestVersion = latestVersion;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductDecription() {
		return productDecription;
	}
	public void setProductDecription(String productDecription) {
		this.productDecription = productDecription;
	}
	public String getLatestVersion() {
		return latestVersion;
	}
	public void setLatestVersion(String latestVersion) {
		this.latestVersion = latestVersion;
	}
	
	
}