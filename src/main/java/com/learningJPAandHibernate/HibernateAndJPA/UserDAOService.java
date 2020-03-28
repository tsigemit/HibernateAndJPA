package com.learningJPAandHibernate.HibernateAndJPA;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert( User user ) {
        //open transaction
        entityManager.persist(user);
        // close transaction
        return user.getId();
    }
}
