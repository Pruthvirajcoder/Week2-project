package com.PruthvirajPawar1.quizapp.dao;

import com.PruthvirajPawar1.quizapp.model.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question> findBycategory(String category);


    @Query(value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM()LIMIT :numQ", nativeQuery = true  )
    List<Question> findRandomQuestionsByCatogary(String category, int numQ);
}
