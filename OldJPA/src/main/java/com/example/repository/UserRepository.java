package com.example.repository;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.example.model.AppUser;

import java.util.List;

public class UserRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPU");

    public void save(AppUser user) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public AppUser findById(int id) {
        EntityManager em = emf.createEntityManager();
        AppUser user = em.find(AppUser.class, id);
        em.close();
        return user;
    }

    public List<AppUser> findAll() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<AppUser> query = em.createQuery("SELECT u FROM AppUser u", AppUser.class);
        List<AppUser> users = query.getResultList();
        em.close();
        return users;
    }
}
