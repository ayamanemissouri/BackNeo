package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.model.Usager;
import org.springframework.data.neo4j.repository.Neo4jRepository;
public interface UsagerRepository extends Neo4jRepository<Usager, Long> {
}
