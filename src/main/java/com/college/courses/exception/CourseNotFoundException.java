package com.college.courses.exception;

public class CourseNotFoundException extends RuntimeException{

	public CourseNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CourseNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
