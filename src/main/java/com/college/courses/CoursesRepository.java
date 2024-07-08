package com.college.courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.courses.entity.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long>{

}
