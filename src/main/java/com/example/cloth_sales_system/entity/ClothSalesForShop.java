package com.example.cloth_sales_system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.cloth_sales_system.vo.ClothSalesReq;

@Entity
@Table(name = "cloth_sales_for_shop")
@IdClass(value = ClothSalesForShopId.class)
public class ClothSalesForShop {

	@Id
	@Column(name = "product_number")
	private Integer productNumber;

	@Id
	@Column(name = "members_number")
	private String membersNumber;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_quantity")
	private Integer productQuantity;

	@Column(name = "product_price")
	private Integer productPrice;

	@Column(name = "purchase_date")
	private Date purchaseDate;

	public ClothSalesForShop() {

	}
	
	public ClothSalesForShop(ClothSalesReq req) {
		this.productNumber = req.getProductNumber();
		this.membersNumber = req.getMembersNumber();
		this.productName = req.getProductName();
		this.productQuantity = req.getProductQuantity();
		this.productPrice = req.getProductPrice();
		this.purchaseDate = req.getPurchaseDate();
	}

	public ClothSalesForShop(Integer productNumber, String membersNumber, String productName, Integer productQuantity,
			Integer productPrice, Date purchaseDate) {
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

	public String getMembersNumber() {
		return membersNumber;
	}

	public void setMembersNumber(String membersNumber) {
		this.membersNumber = membersNumber;
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

}
