package com.example.cloth_sales_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloth_sales_system.entity.ClothSalesForCustomer;
import com.example.cloth_sales_system.entity.ClothSalesForShop;

@Repository
public interface ClothSalesForCustomerDAO extends JpaRepository<ClothSalesForCustomer, String> {

	List<ClothSalesForCustomer> findAllByMembersId(String membersId);

}
