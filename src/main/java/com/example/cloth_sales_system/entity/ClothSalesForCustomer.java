package com.example.cloth_sales_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cloth_sales_for_customer")
public class ClothSalesForCustomer {

	@Id
	@Column(name = "member_id")
	private String membersId;

	@Column(name = "member_name")
	private String memberName;

	@Column(name = "member_password")
	private String memberPassword;

	@Column(name = "member_phone_number")
	private Integer memberPhoneNumber;

	@Column(name = "keep")
	private String keep;

	@Column(name = "remind")
	private String remind;

	@Column(name = "bought_item")
	private String bought_item;

	public ClothSalesForCustomer() {

	}

	public ClothSalesForCustomer(String membersId, String memberName, String memberPassword, Integer memberPhoneNumber,
			String keep, String remind, String bought_item) {
		this.membersId = membersId;
		this.memberName = memberName;
		this.memberPassword = memberPassword;
		this.memberPhoneNumber = memberPhoneNumber;
		this.keep = keep;
		this.remind = remind;
		this.bought_item = bought_item;
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

	public Integer getMemberPhoneNumber() {
		return memberPhoneNumber;
	}

	public void setMemberPhoneNumber(Integer memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public String getKeep() {
		return keep;
	}

	public void setKeep(String keep) {
		this.keep = keep;
	}

	public String getRemind() {
		return remind;
	}

	public void setRemind(String remind) {
		this.remind = remind;
	}

	public String getBought_item() {
		return bought_item;
	}

	public void setBought_item(String bought_item) {
		this.bought_item = bought_item;
	}

}
