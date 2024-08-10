package com.example;
import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ProductRepository prodRepo = new ProductRepository();
        ProductService prodService = new ProductService(prodRepo);
        
        prodService.saveProduct("Chair", 250);
        prodService.saveProduct("Table", 500);
        prodService.saveProduct("Mobile", 15000);
        prodService.saveProduct("Curtains", 400);
        
        prodService.showAllProducts();
        
        Integer prdid = 1;
        Product prod = prodService.findProdById(prdid);
        System.out.println("\nFinding the product by product id: "+ prdid+
        		"\nProduct ID: "+prod.getProdId()+ " | Product Name: "+prod.getProdName()+" | Product Price: "+prod.getPrice()+"\n");
        
        Product produp = new Product();
        produp.setProdId(1);
        produp.setProdName("Pillow");
        produp.setPrice(90);
        String updateMsg = prodService.updateProductData(produp);
        System.out.println(updateMsg);
        
        prodService.showAllProducts();
        
        prodService.deleteProductById(4);
        
        prodService.showAllProducts();
    }
    
    
}
