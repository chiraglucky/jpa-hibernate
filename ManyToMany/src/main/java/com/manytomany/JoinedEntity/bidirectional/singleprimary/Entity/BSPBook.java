package com.manytomany.JoinedEntity.bidirectional.singleprimary.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class BSPBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "bspBook",cascade = CascadeType.ALL)
    private Set<BSPBookPublisher> bspBookPublishers;

    public BSPBook(String name) {
        this.name = name;
    }
}
