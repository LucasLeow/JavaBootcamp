package com.lucas.springboot.learn_spring_jpa_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repo;
    @Autowired
    private CourseJpaRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Course(1, "Learning Java", "Lucas"));
        repo.insert(new Course(2, "Learning JavaScript", "Lucas"));
        repo.deleteById(2);

        System.out.println(repo.getById(1));
    }
}
