package com.manytomany.WithoutJoinedEntity.unidirectional.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SWJPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public SWJPublisher(String name) {
        this.name = name;
    }
}
