package com.PruthvirajPawar1.quizapp.dao;

import com.PruthvirajPawar1.quizapp.Question;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
}
