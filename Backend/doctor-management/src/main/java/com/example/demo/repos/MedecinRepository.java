package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Medecin;


public interface MedecinRepository extends JpaRepository<Medecin, Long> {

	
	List<Medecin> findBySpecialiteNomSpec(String nomSpec);
}
