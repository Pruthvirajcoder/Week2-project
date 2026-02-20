package com.PruthvirajPawar1.quizapp.controller;

import com.PruthvirajPawar1.quizapp.Question;
import com.PruthvirajPawar1.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuations(){
        return questionService.getAllQuestions();
    }
}
