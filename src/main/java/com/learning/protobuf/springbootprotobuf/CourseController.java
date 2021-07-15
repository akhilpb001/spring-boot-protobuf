package com.learning.protobuf.springbootprotobuf;

import com.learning.protobuf.springbootprotobuf.CourseProtos.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

  @Autowired
  private CourseRepository courseRepo;

  @GetMapping("/courses/{id}")
  public Course getCourse(@PathVariable Integer id) {
    return courseRepo.getCourse(id);
  }
}
