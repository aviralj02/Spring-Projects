package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Student {
	@NotNull(message = "is required")
	@Size(min = 2, message = "is required")
	private String name;
	
	@NotNull(message = "is required")
	@Pattern(regexp = "[a-zA-Z0-9]{5,}", message = "only char/digit allowed")
	
	private String password;
	
	private String cpass;
	
	@Email(message = "invalid email")
	@NotNull(message = "is required")
	private String mail;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Past
	@NotNull(message = "is required")
	private Date date;
	
	private String gender;
	
	private String tutor;
	private Map<String, String> tutorOptions;
	
	private List<String> courseOptions;
	private String courses;
	
	public Student() {
		courseOptions = new ArrayList<>();
		courseOptions.add("Java");
		courseOptions.add("C/C++");
		courseOptions.add("Python");
		courseOptions.add("JavaScript");
		
		tutorOptions = new HashMap<>();
		tutorOptions.put("SK", "Sumit Kumar");
		tutorOptions.put("XY", "XY Chaudhary");
		tutorOptions.put("RA", "Ravi Kumar");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public Map<String, String> getTutorOptions() {
		return tutorOptions;
	}
	public void setTutorOptions(Map<String, String> tutorOptions) {
		this.tutorOptions = tutorOptions;
	}
	public List<String> getCourseOptions() {
		return courseOptions;
	}
	public void setCourseOptions(List<String> courseOptions) {
		this.courseOptions = courseOptions;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
