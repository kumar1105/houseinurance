package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Insuranceentity;
import com.example.repo.Insurancerepo;
@Service
public class insuranceserviceimpl  implements insuranceservice{
	@Autowired
	private Insurancerepo repo;

	@Override
	public Insuranceentity createuser(Insuranceentity entity) {
		
		return repo.save(entity);
	}

	@Override
	public Insuranceentity getUserById(int id) {
		Optional<Insuranceentity> optionalUser = repo.findById(id);
		return optionalUser.get();
	}

	@Override
	public List<Insuranceentity> getAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public Insuranceentity updateUser(Insuranceentity user) {
		Insuranceentity oldent=repo.findById(user.getId()).get();
		oldent.setCoveragetype(user.getCoveragetype());
		oldent.setLocation(user.getLocation());
		oldent.setPropertyvalue(user.getPropertyvalue());
		oldent.setHoldername(user.getHoldername());
		oldent.setTenure(user.getTenure()iti);
		Insuranceentity newent=repo.save(oldent);
		return newent;
	}

	@Override
	public void deleteUser(int userId) {
		repo.deleteById(userId);
		
	}

}
