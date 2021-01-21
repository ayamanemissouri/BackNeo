package com.emi.neo4jproject.model;

import com.emi.neo4jproject.Relationships.RoleRelation;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

@Data
@Builder
@NodeEntity
public class Actor {
    @Id
    Long id;

    @Relationship(type = "PLAYED_IN")
    private RoleRelation playedIn;
}
