package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Insuranceentity;
import com.example.services.insuranceservice;
import com.example.services.insuranceserviceimpl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class insurancecontroller {
	@Autowired
	private insuranceserviceimpl service;
	
	@PostMapping
	public ResponseEntity<Insuranceentity> createuser(@RequestBody Insuranceentity entity){
		Insuranceentity newent= service.createuser(entity);
		return new ResponseEntity<>(newent,HttpStatus.CREATED);
		
	}
	
	 @GetMapping("{id}")
	    public ResponseEntity<Insuranceentity> getUserById(@PathVariable("id") int userId){
	        Insuranceentity entity = service.getUserById(userId);
	        return new ResponseEntity<>(entity, HttpStatus.OK);
	    }
	
	 @GetMapping
	    public ResponseEntity<List<Insuranceentity>> getAllUsers(){
	        List<Insuranceentity> entity = service.getAllUsers();
	        return new ResponseEntity<>(entity, HttpStatus.OK);
	    }
	 
	 @PutMapping("{id}")
	  
	    public ResponseEntity<Insuranceentity> updateUser(@PathVariable("id") int userId,
	                                           @RequestBody Insuranceentity entity){
	        entity.setId(userId);
	        Insuranceentity updatedUser = service.updateUser(entity);
	        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	    }

	    @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteUser(@PathVariable("id") int userId){
	        service.deleteUser(userId);
	        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	    }

}
