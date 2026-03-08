package com.PruthvirajPawar1.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.PruthvirajPawar1.quizapp.model.User;

public interface UserRepository extends JpaRepository<User,String> {

    User findByUsername(String username);

}
