package com.PruthvirajPawar1.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Size(min=4, message = "The lenght will be more than one charecter")
    private String questionTitle;
    private  String option1;
    private  String option2;
    private  String option3;
    private  String option4;
    private  String rightAnswer;
    private String difficultylevel;
    private String category;

}
