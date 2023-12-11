package com.hexaware.springapp.dao;


import org.springframework.stereotype.Repository;

import com.hexaware.springapp.beans.Product;
@Repository
public class Product interface IProductDAO {
	@Override
 public Product getProduct() {
		return new Product(101,"Mobile",45000);
	};
}
