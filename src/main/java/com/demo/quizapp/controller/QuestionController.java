package com.demo.quizapp.controller;

import com.demo.quizapp.model.Question;
import com.demo.quizapp.model.Quiz;
import com.demo.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity <List<Question>>  getAllQuestions()
    {
        // for all search: http://localhost:8080/question/allQuestions
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity< List<Question>> getQuestionsByCategory(@PathVariable String category){
        // for java search : localhost:8080/question/category/java
        // for python search: localhost:8080/question/category/python
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String>  addQuestion(@RequestBody Question question)
    {
         return questionService.addQuestion(question);
    }
}
