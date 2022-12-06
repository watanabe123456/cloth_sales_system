package com.example.cloth_sales_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloth_sales_system.entity.ClothSalesForCustomer;

@Repository
public interface ClothSalesForCustomerDAO extends JpaRepository<ClothSalesForCustomer, String> {

}