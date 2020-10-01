package org.hdcd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//클래스 레벨 요청 경로 지정
@RequestMapping("/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//3. 컨트롤러 요청 매핑
	//경로 패턴 매핑
	/*
	//@RequestMapping의 value 속성에 요청 경로를 설정한다.
	//@RequestMapping(value = "/board/register")
	//하위 요청 경로 지정
	@RequestMapping("/register")
	public void registerForm() {
		logger.info("registerForm");
	}
	
	//속성이 하나일 때는 속성명을 생략할 수 있다.
	//@RequestMapping("/board/modify")
	//하위 요청 경로 지정
	@RequestMapping("/modify")
	public void modifyForm() {
		logger.info("modifyForm");
	}
	
	//속성이 하나일 때는 속성명을 생략할 수 있다.
	//@RequestMapping("/board/list")
	//하위 요청 경로 지정
	@RequestMapping("/list")	
	public void list() {
		logger.info("list");
	}
	
	@RequestMapping("/read/{boardNo}")	
	//파라미터 변수 : @PathVariable("boardNo") int boardNo
	public String read(@PathVariable("boardNo") int boardNo) {
		logger.info("read boardNo : " + boardNo);
		
		//경로가 변하므로 뷰 이름 지정
		return "board/read";
	}
	*/
	
	//Http 메서드 매핑
	/*
	// /register 경로에 GET 방식
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm() {
		logger.info("registerForm");
		
		return "success";
	}
	
	// /register 경로에 POST 방식
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register() {
		logger.info("register");
		
		return "success";
	}
	
	// /modify 경로에 GET 방식
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyForm() {
		logger.info("modifyForm");
		
		return "success";
	}
	
	// /modify 경로에 POST 방식
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify() {
		logger.info("modify");
		
		return "success";
	}
	
	// /remove 경로에 POST 방식
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove() {
		logger.info("remove");
		
		return "success";
	}
	
	// /list 경로에 GET 방식
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		logger.info("list");
		
		return "success";
	}
	*/
	
	//Params 매핑
	/*
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="register")
	public String registerForm() {
		logger.info("registerForm");
		
		return "success";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, params="register")
	public String register() {
		logger.info("register");
		
		return "success";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="modify")
	public String modifyForm() {
		logger.info("modifyForm");
		
		return "success";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, params="modify")
	public String modify() {
		logger.info("modify");
		
		return "success";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="remove")
	public String removeForm() {
		logger.info("modifyForm");
		
		return "success";
	}
	
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, params="remove")
	public String remove() {
		logger.info("remove");
		
		return "success";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="remove")
	public String list() {
		logger.info("list");
		
		return "success";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="read")
	public String read() {
		logger.info("read");
		
		return "board/read";
	}
	*/
	
	//Headers 매핑
	/*
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT)
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modify");
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, headers = "X-HTTP-Method-Override=PUT")
	public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByHeader");
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	*/
	
	//content Type 매핑
	/*
	//consumes 속성값을 지정하지 않으면 기본값인 "application/json" 미디어 타입으로 지정된다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.POST)
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modify");
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	//consumes 속성값에 "application/json" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, consumes = "application/json")
		public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByJson");
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	//consumes 속성값에 "application/xml" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, consumes = "application/xml")
		public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByXml boardNo : " + boardNo);
		
		logger.info("modifyByXml board : " + board);
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	*/
	
	//Accept 매핑
	/*
	//produces 속성값에 "apllication/xml" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/xml")
	public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo) {
		logger.info("readToXml");
		
		Board board = new Board();
		
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	
	//produces 속성값에 "apllication/json" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo) {
		logger.info("readToJson");
			
		Board board = new Board();
			
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
			
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	
	//produces 속성값을 지정하지 않으면 기본값인 "application/json" 미디어 타입으로 지정된다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
	public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
		logger.info("readToJson");
			
		Board board = new Board();
			
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
				
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	*/
	
}