package com.example.services;

import java.util.List;

import com.example.entity.Insuranceentity;

public interface insuranceservice {
	Insuranceentity createuser(Insuranceentity entity);
	
	Insuranceentity getUserById(int id);
	
	List<Insuranceentity> getAllUsers();

    Insuranceentity updateUser(Insuranceentity user);

    void deleteUser(int userId);

	
	

}
