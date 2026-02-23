package com.PruthvirajPawar1.quizapp.controller;


import com.PruthvirajPawar1.quizapp.model.Question;
import com.PruthvirajPawar1.quizapp.model.QuestionWrapper;
import com.PruthvirajPawar1.quizapp.model.Response;
import com.PruthvirajPawar1.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title ){
        return quizService.createQuiz(category,numQ,title);


    }
    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuations(@PathVariable Integer id){
        return quizService.getQuizQuations(id);

    }
    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id,responses);
    }

}
