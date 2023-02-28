package com.vw.crud_op.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.crud_op.dto.ShopingCustomer;

@Repository
public interface CustomerRepository extends JpaRepository<ShopingCustomer, Integer>{
		

}
