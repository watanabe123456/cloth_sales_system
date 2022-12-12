package com.example.cloth_sales_system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.cloth_sales_system.vo.ClothSalesReq;

@Entity
@Table(name = "cloth_sales_for_shop")
public class ClothSalesForShop {

	@Id
	@Column(name = "product_number")
	private String productNumber;

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
		this.productName = req.getProductName();
		this.productQuantity = req.getProductQuantity();
		this.productPrice = req.getProductPrice();
		this.purchaseDate = req.getPurchaseDate();
	}

	public ClothSalesForShop(String productNumber, String membersNumber, String productName, Integer productQuantity,
			Integer productPrice, Date purchaseDate) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.purchaseDate = purchaseDate;
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

}
