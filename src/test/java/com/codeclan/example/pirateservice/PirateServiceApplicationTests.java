package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.models.Ship;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import com.codeclan.example.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository; //assigning a variable to our repo

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShipAndRaid(){
		Ship ship1 = new Ship("The Flying Dutchman");
		Ship ship2 = new Ship("Jolly Roger");
		shipRepository.save(ship1);
		shipRepository.save(ship2);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship1);
		Pirate pirate2 = new Pirate("Sandy", "Beach", 23, ship2);
		pirateRepository.save(pirate1);
		pirateRepository.save(pirate2);

		ArrayList<Pirate> pirates  = new ArrayList<>();
		pirates.add(pirate1);
		pirates.add(pirate2);

		Raid raid1 = new Raid("Tortuga", 100);
		raidRepository.save(raid1);
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
