package com.emi.neo4jproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
//import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Node
public class Usager {

    @Id @GeneratedValue
    Long id;
    private String nom;
    private LocalDate an;
    private boolean h;
    private String fct;
    private String pT;

    @Relationship(type = "UTILISE")
    private List<Transport> transports;


    public Usager(String nom, boolean handicap) {
        this.nom = nom;
        this.h = handicap;
    }
}
