package com.question.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question.entities.Question;
import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	//i want to find all quize
	
	List<Question> findByQuizId(Long quizId);

}
