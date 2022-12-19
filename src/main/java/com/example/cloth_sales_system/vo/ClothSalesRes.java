package com.example.cloth_sales_system.vo;

import java.util.List;

import com.example.cloth_sales_system.entity.ClothSalesForCustomer;
import com.example.cloth_sales_system.entity.ClothSalesForShop;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClothSalesRes {

	private ClothSalesForCustomer clothSalesForCustomer;

	private ClothSalesForShop clothSalesForShop;

	private String message;

	private List<ClothSalesForShop> inquireListForShop;

	private List<ClothSalesForCustomer> inquireListForCustomer;

	public ClothSalesRes() {

	}

	public ClothSalesRes(String message) {
		this.message = message;
	}

	public ClothSalesRes(ClothSalesForCustomer clothSalesForCustomer, ClothSalesForShop clothSalesForShop,
			String message) {
		this.clothSalesForCustomer = clothSalesForCustomer;
		this.clothSalesForShop = clothSalesForShop;
		this.message = message;
	}

	public ClothSalesRes(ClothSalesForCustomer clothSalesForCustomer, ClothSalesForShop clothSalesForShop,
			String message, List<ClothSalesForShop> inquireListForShop,
			List<ClothSalesForCustomer> inquireListForCustomer) {
		this.clothSalesForCustomer = clothSalesForCustomer;
		this.clothSalesForShop = clothSalesForShop;
		this.message = message;
		this.inquireListForShop = inquireListForShop;
		this.inquireListForCustomer = inquireListForCustomer;
	}

	public ClothSalesForCustomer getClothSalesForCustomer() {
		return clothSalesForCustomer;
	}

	public void setClothSalesForCustomer(ClothSalesForCustomer clothSalesForCustomer) {
		this.clothSalesForCustomer = clothSalesForCustomer;
	}

	public ClothSalesForShop getClothSalesForShop() {
		return clothSalesForShop;
	}

	public void setClothSalesForShop(ClothSalesForShop clothSalesForShop) {
		this.clothSalesForShop = clothSalesForShop;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ClothSalesForShop> getInquireListForShop() {
		return inquireListForShop;
	}

	public void setInquireListForShop(List<ClothSalesForShop> inquireListForShop) {
		this.inquireListForShop = inquireListForShop;
	}

	public List<ClothSalesForCustomer> getInquireListForCustomer() {
		return inquireListForCustomer;
	}

	public void setInquireListForCustomer(List<ClothSalesForCustomer> inquireListForCustomer) {
		this.inquireListForCustomer = inquireListForCustomer;
	}

}
