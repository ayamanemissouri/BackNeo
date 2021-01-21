package com.emi.neo4jproject.Relationships;


import com.emi.neo4jproject.model.Station;
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
@RelationshipEntity(type = "DISTANCE_RE")
public class Distance {

    @Id
    @GeneratedValue
    Long id;

    private Integer distance;

    @StartNode
    private Station stationDepart;

    @EndNode
    private Station stationArrive;

    public Distance(Long id, Integer distance) {
        this.id = id;
        this.distance = distance;
    }

    public Distance(Integer distance, Station stationDepart, Station stationArrive) {
        this.distance = distance;
        this.stationDepart = stationDepart;
        this.stationArrive = stationArrive;
    }
}
