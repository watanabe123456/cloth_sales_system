package com.example.cloth_sales_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cloth_sales_for_shopping_car")
public class ClothSalesForShoppingCar {

	@Id
	@Column(name = "member_id")
	private String memberId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_quantity")
	private Integer productQuantity;

	@Column(name = "product_price")
	private Integer productPrice;

	@Column(name = "purchase_quantity")
	private Integer purchaseQuantity;

	public ClothSalesForShoppingCar() {

	}

	public ClothSalesForShoppingCar(String memberId, String productName, Integer productQuantity, Integer productPrice,
			Integer purchaseQuantity) {
		this.memberId = memberId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.purchaseQuantity = purchaseQuantity;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public Integer getPurchaseQuantity() {
		return purchaseQuantity;
	}

	public void setPurchaseQuantity(Integer purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}

}
