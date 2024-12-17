package com.demo.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizappApplication  {

	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}

}
//to submit answers ---> http://localhost:8080/quiz/submit/2 to submit answers (http://localhost:8080/quiz/submit/{id})
// for all search: http://localhost:8080/question/allQuestions
// for java search : localhost:8080/question/category/java
// for python search: localhost:8080/question/category/python
