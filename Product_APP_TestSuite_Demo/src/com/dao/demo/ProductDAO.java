package com.dao.demo;

import com.app.demo.Product;

public class ProductDAO {
	
	public ProductDAO()
	{
		System.out.println("Product DAO constructor initialised....");
	}
	public Product save(Product product)
	{
		System.out.println("Product Saved successfully");
		return product;
	}
	public void delete(Product product) {
		System.out.println("Product Deleted successfully");
	}
}
