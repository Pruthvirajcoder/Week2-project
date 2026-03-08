package com.PruthvirajPawar1.quizapp.service;

import com.PruthvirajPawar1.quizapp.model.Question;
import com.PruthvirajPawar1.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();



    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findBycategory(category);
    }

    public String addQuestion(Question question) {
        questionRepository.save(question);
        return "success";
    }

    public boolean deleteQuestion(Integer id) {
        if(questionRepository.existsById(id)){
            questionRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
