package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.Relationships.Traverse;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TraverseRepository extends Neo4jRepository<Traverse, Long> {
}
