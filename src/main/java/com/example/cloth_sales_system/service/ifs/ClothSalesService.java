package com.example.cloth_sales_system.service.ifs;

import com.example.cloth_sales_system.vo.ClothSalesReq;
import com.example.cloth_sales_system.vo.ClothSalesRes;

public interface ClothSalesService {

	public ClothSalesRes addItemInfo(ClothSalesReq req);

	public ClothSalesRes updateItemInfo(ClothSalesReq req);

	public ClothSalesRes inquireInventory(ClothSalesReq req);

	public ClothSalesRes inquireProduct(ClothSalesReq req);

	public ClothSalesRes addCustomerInfo(ClothSalesReq req);

	public ClothSalesRes inquireMembersInfoByMembersId(ClothSalesReq req);

}
