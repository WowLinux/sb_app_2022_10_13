package com.sbs.exam.sb_app_2022_10_13.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserArticleController {

	@RequestMapping("/user/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요";
	}
}
