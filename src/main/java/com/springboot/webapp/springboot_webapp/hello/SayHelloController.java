package com.springboot.webapp.springboot_webapp.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	
	// say-hello
	// http://localhost:8080/
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello Aastha How is your study going?";
		
	}
	// / src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("<h1>Hello Ananta How are you</h1>");
		sb.append("<p>I am doing fine and hope you are doing well to !!</p>");
		return sb.toString();	
	}
	
	@RequestMapping("aastha")
	public String sayHelloAastha() {
		return "aastha";
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}


}
