package com.emi.neo4jproject;

import com.emi.neo4jproject.Relationships.Distance;
import com.emi.neo4jproject.Relationships.Utilise;
import com.emi.neo4jproject.model.Station;
import com.emi.neo4jproject.model.Transport;
import com.emi.neo4jproject.model.Usager;
//import com.emi.neo4jproject.repositoy.UsagerRepository;
import com.emi.neo4jproject.model.Ville;
import com.emi.neo4jproject.repositoy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@EnableNeo4jRepositories
public class Neo4jprojectApplication {
//	private UsagerRepository usagerRepository;

	private final static Logger log = LoggerFactory.getLogger(Neo4jprojectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Neo4jprojectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UsagerRepository usagerRepository,TransportRepository transportRepository, VilleRepository villeRepository, StationRepository stationRepository, DistanceRepository distance, UtiliseRepository utiliseRepository, DistanceRepository distanceRepository) {
		return args -> {


			distanceRepository.deleteAll();
			usagerRepository.deleteAll();
			villeRepository.deleteAll();
			stationRepository.deleteAll();
			utiliseRepository.deleteAll();
			transportRepository.deleteAll();





//			Utilise utilise = new Utilise(2, null, transport);
//			greg.setUtiliseTransports(Arrays.asList(utilise));
////			List<Utilise> utilises = Arrays.asList(utilise);
////			Set<Utilise> utilisesset = new HashSet<>(utilises);
//            usagerRepository.save(greg);
//			transport.setUtilisateurs(utilisesset);
//			transportRepository.save(transport);
//
//			utiliseRepository.save(utilise);
//
//			Station station = new Station("babrouah", 2);
//
//
//			Station station1 = new Station("agdal", 5);
//
//			Station station2 = new Station("alabtal", 7);
//			Station station4 = new Station("bab challa", 7);
//			Station station3 = new Station("hemria", 9);

//			stationRepository.save(station);
//			stationRepository.save(station1);

//			distanceRepository.save(new Distance(2, station, station1));
//			distanceRepository.save(new Distance(5, station1, station2));
//			distanceRepository.save(new Distance(7, station, station2));
//			distanceRepository.save(new Distance(12, station2, station4));

//			List<Distance> distances = Arrays.asList(new Distance(2, station, station1), new Distance(5, station1, station2), new Distance(7, station, station2), new Distance(12, station2, station4));
//			List<Distance> distances = Arrays.asList(new Distance(2, station, station1));
//			Set<Distance> setdist = new HashSet<>(distances);

//			station.setVers(distances);



//
//			Ville ville = new Ville("Rabat");
//			Ville ville1 = new Ville("Meknes");
//
//			station.setVille(ville);
//			station1.setVille(ville);
//			station2.setVille(ville);
//			station3.setVille(ville1);
//
//


//			List<Usager> team = Arrays.asList(greg, roy, craig);
//			List<Ville> villes = Arrays.asList(ville, ville1);
//			List<Station> stations = Arrays.asList(station, station1, station2, station3);
//
//			villeRepository.saveAll(villes);
//			stationRepository.saveAll(stations);
//
//			distanceRepository.save(new Distance(2, station, station1));
//

			log.info("Before linking up with Neo4j...");

//			team.stream().forEach(usager -> log.info("\t" + usager.toString()));





		};
	}
}
