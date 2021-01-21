package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.Relationships.Distance;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DistanceRepository extends Neo4jRepository<Distance, Long> {
}
