package com.college.courses.services;

import java.util.List;



import com.college.courses.entity.Courses;

public interface CoursesService {

	public List<Courses> getAllCourses();
	public Courses getCourses(Long id);
	public String addCourses(List<Courses> courses);
	public String addOneCourse(Courses courses);
	public String updateCourses(Courses courses);
	public String deleteCourse(Long id);
}
