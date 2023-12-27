package com.example.demo.app.survey;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class SurveyForm {
	
	@NotNull
	@Min(0)
	@Max(150) // message = "must be less than or equal to 150"
	private String age;
	
	@NotNull
	@Min(1)
	@Max(5)
	private String satisfaction;
	
	@NotNull
	@Size(min = 1, max = 200, message = "Please input 200 characters or less")
	private String comment;
	

	public SurveyForm() {
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSatisfaction() {
		return satisfaction;
	}


	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}




}
