package br.com.denis.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class ExemploController {

	@RequestMapping("/")
	@ResponseBody
	public String home (){
		return "<h1>Ola Denis!!!!<h1>";
	}
	public static void main(String[] args) {
		SpringApplication.run(ExemploController.class, args);
	}
}
