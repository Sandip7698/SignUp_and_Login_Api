package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Logindto;
import com.example.demo.model.SignUp;
import com.example.demo.service.SignUpService;

@RestController
public class LoginController {
@Autowired
SignUpService signUpService;
//@PostMapping("/login")
//public ResponseEntity<String> login(@RequestBody Logindto logindto){
//	return signUpService.login(logindto);
//}

//@GetMapping("/allemail")
//public List<SignUp> allemail(String email){
//	return signUpService.allinfo(email);
//	
//}
}
