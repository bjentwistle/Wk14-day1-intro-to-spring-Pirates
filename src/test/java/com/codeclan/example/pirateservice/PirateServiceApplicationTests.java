package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository; //assigning a variable to our repo

	@Test
	void contextLoads() {
	}

//	@Test
//	public void canCreatePirate() {
//		Pirate jack = new Pirate("Jack", "John", 23);
//		Pirate bob = new Pirate("Bob", "Cratchett", 15);
//		Pirate sandy = new Pirate("Sandy", "Beach", 35);
//		pirateRepository.save(jack);
//		pirateRepository.save(bob);
//		pirateRepository.save(sandy);
//	}
}
