package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.model.Station;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StationRepository extends Neo4jRepository<Station, Long> {

}
