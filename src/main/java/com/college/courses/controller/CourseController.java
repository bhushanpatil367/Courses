package com.college.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.college.courses.entity.Courses;
import com.college.courses.response.ResponseHandler;
import com.college.courses.services.CoursesService;

@RestController
@RequestMapping("/Courses")
public class CourseController {

	@Autowired
	private CoursesService coursesService;
	
	@GetMapping("/getAllCourses")
	public ResponseEntity<Object> getAllCourses(){
		
		return ResponseHandler.responseBuilder("Requested All Courses Details Here ", HttpStatus.OK, coursesService.getAllCourses());
		
	}
	
	@GetMapping("/getCourses/{id}")
	public ResponseEntity<Object> getCourses(@PathVariable Long id) {
		
		return ResponseHandler.responseBuilder("Request Course Details are given Here ", HttpStatus.OK, coursesService.getCourses(id));
		 
	}
	
	@PostMapping("/addCourses")
	public ResponseEntity<Object> addCourses(@RequestBody List<Courses> courses) {
		
		return ResponseHandler.responseBuilder("Courses Added ", HttpStatus.OK, coursesService.addCourses(courses));
	}
	
	@PostMapping("/addOneCourse")
	public ResponseEntity<Object> addOneCourse(@RequestBody Courses courses) {
		
		return ResponseHandler.responseBuilder("Single Course Added", HttpStatus.OK, coursesService.addOneCourse(courses));
		
	}
	
	@PutMapping("/updateCourses")
	public ResponseEntity<Object> updateCourses(@RequestBody Courses courses) {
		
		return ResponseHandler.responseBuilder("Course Updated", HttpStatus.OK, coursesService.updateCourses(courses));
			
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<Object> deleteCourse(@PathVariable("id") Long id) {
		
		return ResponseHandler.responseBuilder("Course Updated", HttpStatus.OK, coursesService.deleteCourse(id));
		
	}
}
