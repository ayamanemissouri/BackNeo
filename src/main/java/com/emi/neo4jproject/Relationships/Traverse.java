package com.emi.neo4jproject.Relationships;

import com.emi.neo4jproject.model.Station;
import com.emi.neo4jproject.model.Transport;
import lombok.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@RelationshipEntity(type = "TRAVERSE")
public class Traverse {

    @Id
    @GeneratedValue
    Long id;

    private Integer heureArrive;

    @StartNode
    private Transport transport;

    @EndNode
    private Station station;

    public Traverse(Long id, Integer heureArrive) {
        this.id = id;
        this.heureArrive = heureArrive;
    }
}
