package com.emi.neo4jproject.model;

import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@NodeEntity
public class Ville {

    @Id
    @GeneratedValue
    Long Id;
    private String nom;

    public Ville(String nom) {
        this.nom = nom;
    }
}
