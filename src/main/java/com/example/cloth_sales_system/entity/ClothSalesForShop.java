package com.example.cloth_sales_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cloth_sales_for_shop")
public class ClothSalesForShop {

	@Id
	@Column(name = "product_number")
	private Integer productNumber;

	@Id
	@Column(name = "members_number")
	private Integer membersNumber;

	@Column(name = "product_name")
	private Integer productName;

	@Column(name = "product_quantity")
	private Integer productQuantity;

	@Column(name = "product_price")
	private Integer productPrice;

	@Column(name = "purchase_date")
	private Integer purchaseDate;

	public ClothSalesForShop() {

	}

	public ClothSalesForShop(Integer productNumber, Integer membersNumber, Integer productName, Integer productQuantity,
			Integer productPrice, Integer purchaseDate) {
		this.productNumber = productNumber;
		this.membersNumber = membersNumber;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.purchaseDate = purchaseDate;
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

	public Integer getProductName() {
		return productName;
	}

	public void setProductName(Integer productName) {
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

	public Integer getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Integer purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
