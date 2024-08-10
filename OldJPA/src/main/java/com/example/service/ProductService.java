package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;

public class ProductService {
	
	private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    public void saveProduct(String prodName, Integer price) {
    	productRepository.save(new Product(prodName, price));
    }
    
    public Product findProdById(Integer prodId) {
    	return productRepository.findById(prodId);
    }
    
    public void showAllProducts() {
    	for(Product p : productRepository.findAll())
    		System.out.println("\nProduct ID: "+p.getProdId()+ " | Product Name: "+p.getProdName()+" | Product Price: "+p.getPrice());
    }
    
    public String updateProductData(Product prd) {
    	return productRepository.update(prd);
    }
    
    public void deleteProductById(Integer prodId) {
    	productRepository.deleteById(prodId);
    }

}
