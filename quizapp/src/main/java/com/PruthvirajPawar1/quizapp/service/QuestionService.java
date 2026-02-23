package com.PruthvirajPawar1.quizapp.service;

import com.PruthvirajPawar1.quizapp.model.Question;
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

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findBycategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public boolean deleteQuestion(Integer id) {
        if(questionDao.existsById(id)){
            questionDao.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
