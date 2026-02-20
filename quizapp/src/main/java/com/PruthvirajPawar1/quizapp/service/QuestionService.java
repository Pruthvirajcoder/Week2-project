package com.PruthvirajPawar1.quizapp.service;

import com.PruthvirajPawar1.quizapp.Question;
import com.PruthvirajPawar1.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();



    }
}
