package com.lucas.springboot.learn_spring_jpa_hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long> {
}
