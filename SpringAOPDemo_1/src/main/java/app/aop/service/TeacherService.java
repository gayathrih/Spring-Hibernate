package app.aop.service;

import org.springframework.stereotype.Component;

@Component
public class TeacherService {

	private String name;
	private String courseName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
