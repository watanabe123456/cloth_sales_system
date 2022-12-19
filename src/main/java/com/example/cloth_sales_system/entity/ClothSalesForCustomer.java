package com.example.cloth_sales_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.cloth_sales_system.vo.ClothSalesReq;

@Entity
@Table(name = "cloth_sales_for_customer")
public class ClothSalesForCustomer {

	@Id
	@Column(name = "members_id")
	private String membersId;

	@Column(name = "member_name")
	private String memberName;

	@Column(name = "member_password")
	private String memberPassword;

	@Column(name = "email")
	private String email;

	@Column(name = "member_phone_number")
	private Integer memberPhoneNumber;

	@Column(name = "bought_item")
	private String boughtItem;

	public ClothSalesForCustomer() {

	}

	public ClothSalesForCustomer(ClothSalesReq req) {
		this.membersId = req.getMembersId();
		this.memberName = req.getMemberName();
		this.memberPassword = req.getMemberPassword();
		this.email = req.getEmail();
		this.memberPhoneNumber = req.getMemberPhoneNumber();
		this.boughtItem = req.getBoughtItem();
	}

	public ClothSalesForCustomer(String membersId, String memberName, String memberPassword, String email,
			Integer memberPhoneNumber, String boughtItem) {
		this.membersId = membersId;
		this.memberName = memberName;
		this.memberPassword = memberPassword;
		this.email = email;
		this.memberPhoneNumber = memberPhoneNumber;
		this.boughtItem = boughtItem;
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
