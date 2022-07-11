package edu.hi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * 작성자 : 정다은
 * 날짜 : 2022/07/11
 * 내용 : 시큐리티 관련
 * 특이사항 : 
 */
@RestController
public class SecurityController{

	@GetMapping("/")
	public String Home() {
		return "HelloWorld";
	}

}
