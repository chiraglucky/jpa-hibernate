package com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class BSCPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "BSCPublisher",cascade = CascadeType.ALL)
    private Set<BSCBookPublisher> BSCBookPublishers;

    public BSCPublisher(String name) {
        this.name = name;
    }
}
