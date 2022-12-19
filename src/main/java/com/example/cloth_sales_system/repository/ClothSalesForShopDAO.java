package com.example.cloth_sales_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloth_sales_system.entity.ClothSalesForShop;

@Repository
public interface ClothSalesForShopDAO extends JpaRepository<ClothSalesForShop, String> {

	public List<ClothSalesForShop> findAllByProductNumber(String productNumber);

	public List<ClothSalesForShop> findAllByProductName(String productName);


}
