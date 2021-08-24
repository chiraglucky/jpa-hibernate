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
public class BSCBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "BSCBook",cascade = CascadeType.ALL)
    private Set<BSCBookPublisher> BSCBookPublishers;

    public BSCBook(String name) {
        this.name = name;
    }
}
