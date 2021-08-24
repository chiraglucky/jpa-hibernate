package com.manytomany.WithoutJoinedEntity.bidirectional.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class BWJPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "bwjPublishers")
    private Set<BWJBook> bwjBooks;

    public BWJPublisher(String name) {
        this.name = name;
    }
}
