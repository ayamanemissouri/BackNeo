package com.emi.neo4jproject.model;


import com.emi.neo4jproject.Relationships.Utilise;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Transport {
    @Id
    @GeneratedValue
    Long id;

    private String type;
    private Integer num;
    private String matricule;
    //    private String ville;
    private Integer vitesse;
    private Integer capacity;
    private String pdC;
    private Integer prix;

    @Relationship(type = "TRAVERSE")
    private Set<Station> stations;


    @Relationship(type="UTILISE", direction = Relationship.Direction.INCOMING)
    private Set<Utilise> utilisateurs;

    public Transport(Long id, String typeTransport, Integer numero, String matricule, Integer vitesse, Integer capacite, String pdC, Integer prix, String marque) {
        this.id = id;
        this.type = typeTransport;
        this.num = numero;
        this.matricule = matricule;
        this.vitesse = vitesse;
        this.capacity = capacite;
        this.pdC = pdC;
        this.prix = prix;

    }

    public Transport(String typeTransport) {

        this.type = typeTransport;
    }
}
