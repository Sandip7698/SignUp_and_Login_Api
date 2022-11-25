package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Stack;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.Logindto;
import com.example.demo.dto.SignUpdto;
import com.example.demo.model.SignUp;

public interface SignUpService {

	ResponseEntity<String> save(SignUpdto signUpdto);

	Optional<SignUp> findByemail(String email);

	ResponseEntity<String> deleteById(Long userId);

	Optional<SignUp> findBypass(String password);

	ResponseEntity<String> login(SignUpdto signUpdto);

	Optional<SignUp> findByuserName(String userName);




	

}
