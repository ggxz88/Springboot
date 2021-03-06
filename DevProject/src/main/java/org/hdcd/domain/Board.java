package org.hdcd.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "board")
public class Board {
	
	
	private int boardNo;
	//private String title;
	
	//15. 예외 처리
	//입력값 검증 예외 처리
	//입력값의 검사 규칙을 지정한다.
	@NotBlank
	private String title;
	
	private String content;
	private String writer;
	private Date regDate;
	
	public int getBoardNo() {
		return boardNo;
	}
	
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	//JPA
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "board_no")
	private Integer boardNo;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "writer")
	private String writer;
	
	@Column(name = "reg_date")
	private String regDate;

	public Integer getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Integer boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	*/
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate=" + regDate + "]";
	}
	
	
}
