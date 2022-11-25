package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Stack;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

//import com.example.demo.config.Config;
import com.example.demo.dao.SignUpRepository;
import com.example.demo.dto.Logindto;
import com.example.demo.dto.SignUpdto;
import com.example.demo.model.SignUp;
import com.example.demo.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService{
@Autowired
SignUpRepository signUpRepository;

@Override
public ResponseEntity<String> save(SignUpdto signUpdto) {
   SignUp signUp=new SignUp();
   signUp.setFirstName(signUpdto.getFirstName());
   signUp.setLastName(signUpdto.getLastName());
   
   Optional<SignUp> email=signUpRepository.findByemail(signUpdto.getEmail());
	if(!email.isPresent()) {
		signUp.setEmail(signUpdto.getEmail());	
	}else {
		return new ResponseEntity<>("Email Already Present..",HttpStatus.OK);
	}
   signUp.setPhoneNo(signUpdto.getPhoneNo());
   
   Optional<SignUp> user=signUpRepository.findByuserName(signUpdto.getUserName());
	if(!user.isPresent()) {
		signUp.setUserName(signUpdto.getUserName());	
	}else {
		return new ResponseEntity<>("UserName is Already Present....",HttpStatus.OK);
	}
   signUp.setPassword(signUpdto.getPassword());
   signUp.setAddress(signUpdto.getAddress());
   signUpRepository.save(signUp);
   
   return new ResponseEntity<>("200 SUCCESSFULL REGISTERED",HttpStatus.OK);
}

@Override
public Optional<SignUp> findByemail(String email) {
	
	return signUpRepository.findByemail(email);
}

@Override
public ResponseEntity<String> deleteById(Long userId) {
	signUpRepository.deleteById(userId);
	return new ResponseEntity<>("User Delete Sucessfully...",HttpStatus.OK);
}

@Override
public Optional<SignUp> findBypass(String password) {
	return signUpRepository.findBypassword(password);
}

@Override
public ResponseEntity<String> login(SignUpdto signUpdto) {
	Optional<SignUp> email=signUpRepository.findByemail(signUpdto.getEmail());
	Optional<SignUp> password=signUpRepository.findBypassword(signUpdto.getPassword());
	if(email.isPresent() && password.isPresent()) {
		return new ResponseEntity<>("Login SucessFully... ",HttpStatus.OK);	
	}else {
		return new ResponseEntity<>("Invalid Criditantials....",HttpStatus.OK);
	}
}

@Override
public Optional<SignUp> findByuserName(String userName) {
	return signUpRepository.findByuserName(userName);
}














}
