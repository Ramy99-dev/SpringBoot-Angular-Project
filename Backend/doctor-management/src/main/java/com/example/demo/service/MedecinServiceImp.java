package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Medecin;
import com.example.demo.entities.Specialite;
import com.example.demo.repos.MedecinRepository;

@Service
public class MedecinServiceImp implements MedecinService {

	@Autowired
	MedecinRepository medecinRepository;
	
	@Override
	public Medecin saveMedecin(Medecin m) {
		return medecinRepository.save(m);
	}

	@Override
	public Medecin updateMedecin(Medecin m) {
		return medecinRepository.save(m);
	}

	@Override
	public void deleteMedecin(Medecin m) {
		 medecinRepository.delete(m);

	}

	@Override
	public void deleteMedecinById(Long id) {
		medecinRepository.deleteById(id);

	}

	@Override
	public Medecin getMedecin(Long id) {
		return medecinRepository.findById(id).get();
	}

	@Override
	public List<Medecin> getAllMedecin() {
		return medecinRepository.findAll();
	}

	@Override
	public Page<Medecin> getAllmedecinPage(int page, int size) {
		return  medecinRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Medecin> findMedecinBySpecialite(String s) {
		return medecinRepository.findBySpecialiteNomSpec(s);
		
	}

}
