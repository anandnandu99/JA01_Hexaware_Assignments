package com.hexaware.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springapp.beans.Product;

@Service
public class ProductServiceImp implements IProductService {
@Autowired
IProductDAO dao;
@Override
public Product getProduct() {
	return dao.getProduct();
}
}
