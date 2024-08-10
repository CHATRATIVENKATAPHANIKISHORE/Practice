package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.example.model.Product;


public class ProductRepository {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProductPU");

	public void save(Product prd) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(prd);
		em.getTransaction().commit();
		em.close();		
	}
	
	public Product findById(int prodId) {
        EntityManager em = emf.createEntityManager();
        Product prd = em.find(Product.class, prodId);
        em.close();
        return prd;
    }
	
    public List<Product> findAll() {
		EntityManager em = emf.createEntityManager();
        TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p", Product.class);
        return query.getResultList();
    }
	
    public String update(Product prd) {
    	String msg = "";
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	Product p = em.merge(prd);
    	em.getTransaction().commit();
    	em.close();
    	if(p!=null) {
    		msg = "Data updated successfully";
    	}
    	return msg;
    }
    
	public void deleteById(int prodId) {
        EntityManager em = emf.createEntityManager();
        Product prd = em.find(Product.class, prodId);
        if(prd!=null)
        	em.remove(prd);
        em.close();
    }
	
}
