package com.sammidev.belajar.h2.service;

import com.sammidev.belajar.h2.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }

    public User find(long id) {
        return entityManager.find(User.class, id);
    }

    public List<User> findAll() {
        Query query = entityManager.createNamedQuery(
                "query_find_all_users", User.class);
        return query.getResultList();
    }
}
