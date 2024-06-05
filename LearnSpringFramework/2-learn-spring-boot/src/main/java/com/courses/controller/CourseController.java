package com.courses.controller;

import com.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn Microservices", "Lucas"));
    }
}
