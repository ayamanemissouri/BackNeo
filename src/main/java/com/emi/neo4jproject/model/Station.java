package com.emi.neo4jproject.model;

import com.emi.neo4jproject.Relationships.Distance;
import com.emi.neo4jproject.Relationships.Traverse;
import lombok.*;

import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Station {

    @Id @GeneratedValue
    Long id;

    private String nom;
    private Integer numero;

    @Relationship(type = "TRAVERSE" , direction = Relationship.Direction.INCOMING)
    private List<Traverse> transport;

    @Relationship(type="DISTANCE_RE")
    private Set<Distance> vers = Collections.emptySet();

    @Relationship(type = "SITUE")
    private Ville ville;


    public Station(String nom, Integer numero) {
        this.nom = nom;
        this.numero = numero;
    }

}
