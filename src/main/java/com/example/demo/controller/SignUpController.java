package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SignUpdto;
import com.example.demo.model.SignUp;
import com.example.demo.service.SignUpService;

@RestController
public class SignUpController {
@Autowired
SignUpService signUpService;

@PostMapping("/save")
public ResponseEntity<String> save(@RequestBody SignUpdto signUpdto){
	return signUpService.save(signUpdto);
}

@GetMapping("/findByemail/{email}")
public Optional<SignUp> getemail(@PathVariable ("email") String email){
	return signUpService.findByemail(email);
}

@GetMapping("/findByuser/{userName}")
public Optional<SignUp> getuser(@PathVariable ("userName") String userName){
	return signUpService.findByuserName(userName);
}

@GetMapping("/findBypass/{password}")
public Optional<SignUp> getpass(@PathVariable ("password") String password){
	return signUpService.findBypass(password);
}

@DeleteMapping("/deleteByid/{userId}")
public ResponseEntity<String> deleteUser(@PathVariable ("userId")Long userId){
		return signUpService.deleteById(userId);
	}
 
@PostMapping("/login")
public ResponseEntity<String> login(@RequestBody SignUpdto signUpdto){
	return signUpService.login(signUpdto);
}


}
