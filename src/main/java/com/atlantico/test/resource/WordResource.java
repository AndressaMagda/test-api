package com.atlantico.test.resource;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atlantico.test.model.Word;
import com.atlantico.test.repository.WordRepository;
import com.atlantico.test.util.StringUtils;

@RestController
@CrossOrigin("${origem-permitida}")
public class WordResource {
	@Autowired
	private WordRepository wordRepository;

	@GetMapping("/words")
	public List<Word> listar() {
		return wordRepository.findAll();
	}

	@PostMapping("/palindrome")
	public Word isPalindrome(@RequestBody @Valid Word word) {

		long tempInicial = System.nanoTime();

		word.setPalindrome(StringUtils.isPalindrome(word.getText()));

		long tempFinal = System.nanoTime();

		word.setTime(new Timestamp(tempFinal - tempInicial));

		Word saved = wordRepository.save(word);
		saved.setText(null);

		return saved;

	}

	@PostMapping("/firstChar")
	public Word findFirstChar(@RequestBody @Valid Word word) {

		long tempInicial = System.nanoTime();

		word.setFirstChar(StringUtils.firstNotRepeated(word.getText()));

		long tempFinal = System.nanoTime();

		word.setTime(new Timestamp(tempFinal - tempInicial));

		Word saved = wordRepository.save(word);
		saved.setText(null);

		return saved;

	}

}
