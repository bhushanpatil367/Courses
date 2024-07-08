package com.college.courses.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.courses.CoursesRepository;
import com.college.courses.entity.Courses;
import com.college.courses.exception.CourseNotFoundException;
import com.college.courses.services.CoursesService;

@Service
public class CoursesServiceImpl implements CoursesService{

	@Autowired
	private CoursesRepository coursesRepository;
	
	@Override
	public List<Courses> getAllCourses() {
		
		return coursesRepository.findAll();
	}

	@Override
	public Courses getCourses(Long id) {
		
		if(coursesRepository.findById(id).isEmpty())
			throw new CourseNotFoundException("Request Course is does not Exist");
		return coursesRepository.findById(id).get();
	}

	@Override
	public String addCourses(List<Courses> courses) {
		coursesRepository.saveAll(courses);
		return "Course Added";
	}

	@Override
	public String addOneCourse(Courses courses) {
		
		coursesRepository.save(courses);
		return "Course Added";
	}

	@Override
	public String updateCourses(Courses courses) {

		coursesRepository.save(courses);
		return "Course Updated";
	}

	@Override
	public String deleteCourse(Long id) {
		
		coursesRepository.deleteById(id);
		return "Course Deleted";
	}
	
	

}
