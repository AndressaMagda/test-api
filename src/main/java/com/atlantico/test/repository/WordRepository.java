package com.atlantico.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atlantico.test.model.Word;

public interface WordRepository extends JpaRepository<Word, Long> {

}
