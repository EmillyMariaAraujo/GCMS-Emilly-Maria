package com.example.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
@RequestMapping("/")
public @ResponseBody String greeting() {
return "Hello, World!";
}
//testando 
@RequestMapping("/Emilly")
public @ResponseBody String greetingEmilly() {
return "Hello, Emilly!";
}

@RequestMapping("/Ramide")
public @ResponseBody String greetingRamide() {
return "Hello, Ramide!";
}
//testando 

@RequestMapping("/Laura")
public @ResponseBody String greetingLaura() {
return "Hello, Laura!";
}
@RequestMapping("/Thais")
public @ResponseBody String greetingThais() {
return "Hello, Thais!";
}

}