package com.example.cloth_sales_system.entity;

public class ClothSalesForShopId {

	private Integer productNumber;

	private Integer membersNumber;

	public ClothSalesForShopId() {

	}

	public ClothSalesForShopId(Integer productNumber, Integer membersNumber) {
		this.productNumber = productNumber;
		this.membersNumber = membersNumber;
	}

	public Integer getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}

	public Integer getMembersNumber() {
		return membersNumber;
	}

	public void setMembersNumber(Integer membersNumber) {
		this.membersNumber = membersNumber;
	}

}
