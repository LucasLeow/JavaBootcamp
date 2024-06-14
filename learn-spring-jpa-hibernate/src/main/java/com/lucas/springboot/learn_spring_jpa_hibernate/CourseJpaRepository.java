package com.lucas.springboot.learn_spring_jpa_hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager em;

    public void insert(Course course) {
        em.merge(course);
    }

    public Course getById(long id) {
        return em.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course c = em.find(Course.class, id);
        em.remove(c);
    }
}
