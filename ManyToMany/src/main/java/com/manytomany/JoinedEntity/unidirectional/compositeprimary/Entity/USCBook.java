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
public class USCBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public USCBook(String name) {
        this.name = name;
    }
}
