package com.atlantico.test.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Word {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String text;

	private Boolean palindrome;

	@Column(name = "firstchar")
	private String firstChar;

	@Column(name = "runtime")
	private Timestamp time;

	public Word() {
	}

	public Word(String text, Boolean palindrome, Timestamp time) {
		this.text = text;
		this.palindrome = palindrome;
		this.time = time;
	}

	public Word(String text, String firstChar, Timestamp time) {
		this.text = text;
		this.firstChar = firstChar;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean isPalindrome() {
		return palindrome;
	}

	public void setPalindrome(Boolean palindrome) {
		this.palindrome = palindrome;
	}

	public String getFirstChar() {
		return firstChar;
	}

	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Word [id=" + id + ", text=" + text + ", palindrome=" + palindrome + ", firstChar=" + firstChar
				+ ", time=" + time + "]";
	}

}
