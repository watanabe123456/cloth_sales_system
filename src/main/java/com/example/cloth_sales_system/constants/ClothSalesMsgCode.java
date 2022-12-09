package com.example.cloth_sales_system.constants;

public enum ClothSalesMsgCode {
	
	SUCCESSFUL("200", "Successful"),
	ITEM_EXISTED("403", "Item existed"),
	PRODUCT_NUMBER_REQUIRED("400", "Product number cannot be null or empty or 0!!"),
	PRODUCT_NAME_REQUIRED("400", "Product name cannot be null or empty!!"),
	PRODUCT_QUANTITY_REQUIRED("400", "Product quantity cannot be null or empty or 0!!"),
	PRODUCT_PRICE_REQUIRED("400", "Product quantity cannot be null or empty or less than 0 or equal 0!!");

	private String code;

	private String message;

	private ClothSalesMsgCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
