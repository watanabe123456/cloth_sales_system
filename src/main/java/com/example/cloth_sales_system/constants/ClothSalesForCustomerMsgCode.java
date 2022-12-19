package com.example.cloth_sales_system.constants;

public enum ClothSalesForCustomerMsgCode {

	SUCCESSFUL("200", "Successful"),
	MEMBERS_ID_EXISTED("403", "Members ID existed"),
	MEMBERS_ID_REQUIRED("400", "Members ID required"),
	MEMBER_NAME_REQUIRED("400", "Member name required"),
	MEMBER_PASSWORD_REQUIRED("400", "Member password required"),
	EMAIL_REQUIRED("400", "Email required"),
	MEMBER_PHONE_NUMBER_REQUIRED("400", "Member phone number required");

	private String code;

	private String message;

	private ClothSalesForCustomerMsgCode(String code, String message) {
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
