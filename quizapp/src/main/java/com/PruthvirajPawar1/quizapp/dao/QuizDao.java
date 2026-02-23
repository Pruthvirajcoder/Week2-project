package com.PruthvirajPawar1.quizapp.dao;

import com.PruthvirajPawar1.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

    Quiz quiz=new Quiz();

}
