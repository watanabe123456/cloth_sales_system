package com.example.cloth_sales_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloth_sales_system.entity.ClothSalesForShop;

@Repository
public interface ClothSalesForShopDAO extends JpaRepository<ClothSalesForShop, Integer> {

}
