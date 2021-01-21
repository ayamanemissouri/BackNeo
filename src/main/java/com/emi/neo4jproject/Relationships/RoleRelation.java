package com.emi.neo4jproject.Relationships;

import com.emi.neo4jproject.model.Actor;
import com.emi.neo4jproject.model.Movie;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@Builder
@RelationshipEntity(type = "PLAYED_IN")
public class RoleRelation {
    @Id
    @GeneratedValue
    private Long relationshipId;
    @Property
    private String title;
    @StartNode
    private Actor actor;
    @EndNode
    private Movie movie;
}