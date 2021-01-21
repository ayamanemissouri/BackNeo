package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.Relationships.Utilise;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UtiliseRepository extends Neo4jRepository<Utilise, Long> {
}
