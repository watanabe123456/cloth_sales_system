package com.example.cloth_sales_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloth_sales_system.service.ifs.ClothSalesService;
import com.example.cloth_sales_system.vo.ClothSalesReq;
import com.example.cloth_sales_system.vo.ClothSalesRes;

@RestController
public class ClothSalesSystemController {

	@Autowired
	private ClothSalesService clothSalesService;

	@PostMapping(value = "/api/add_item_info")
	public ClothSalesRes addItemInfo(@RequestBody ClothSalesReq req) {
		return clothSalesService.addItemInfo(req);
	}

	@PostMapping(value = "/api/update_item_info")
	public ClothSalesRes updateItemInfo(@RequestBody ClothSalesReq req) {
		return clothSalesService.updateItemInfo(req);
	}

	@PostMapping(value = "/api/inquire_inventory")
	public ClothSalesRes inquireInventory(@RequestBody ClothSalesReq req) {
		return clothSalesService.inquireInventory(req);
	}

	@PostMapping(value = "/api/inquire_product")
	public ClothSalesRes inquireProduct(@RequestBody ClothSalesReq req) {
		return clothSalesService.inquireProduct(req);
	}

	@PostMapping(value = "/api/add_customer_info")
	public ClothSalesRes addCustomerInfo(@RequestBody ClothSalesReq req) {
		return clothSalesService.addCustomerInfo(req);
	}
	
	@PostMapping(value = "/api/inquire_members_id")
	public ClothSalesRes inquireMembersId(@RequestBody ClothSalesReq req) {
		return clothSalesService.inquireMembersInfoByMembersId(req);

	}
}
