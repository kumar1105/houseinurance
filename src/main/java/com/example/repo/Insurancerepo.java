package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Insuranceentity;

@Repository
public interface Insurancerepo extends JpaRepository<Insuranceentity, Integer> {

}
