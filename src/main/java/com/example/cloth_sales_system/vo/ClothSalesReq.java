package com.example.cloth_sales_system.vo;

import java.util.Date;

public class ClothSalesReq {

	private String productNumber;

	private String productName;

	private Integer productQuantity;

	private Integer productPrice;

	private Date purchaseDate = new Date();

	private String membersId;

	private String memberName;

	private String memberPassword;

	private String email;

	private Integer memberPhoneNumber;

	private String boughtItem;

	public ClothSalesReq() {

	}

	public ClothSalesReq(String productNumber, String productName, Integer productQuantity, Integer productPrice,
			Date purchaseDate, String membersId, String memberName, String memberPassword, String email,
			Integer memberPhoneNumber, String boughtItem) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.purchaseDate = purchaseDate;
		this.membersId = membersId;
		this.memberName = memberName;
		this.memberPassword = memberPassword;
		this.email = email;
		this.memberPhoneNumber = memberPhoneNumber;
		this.boughtItem = boughtItem;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getMembersId() {
		return membersId;
	}

	public void setMembersId(String membersId) {
		this.membersId = membersId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMemberPhoneNumber() {
		return memberPhoneNumber;
	}

	public void setMemberPhoneNumber(Integer memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public String getBoughtItem() {
		return boughtItem;
	}

	public void setBoughtItem(String boughtItem) {
		this.boughtItem = boughtItem;
	}

}
