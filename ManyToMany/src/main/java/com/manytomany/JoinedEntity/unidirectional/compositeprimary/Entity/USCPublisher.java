package com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class USCPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public USCPublisher(String name) {
        this.name = name;
    }
}
