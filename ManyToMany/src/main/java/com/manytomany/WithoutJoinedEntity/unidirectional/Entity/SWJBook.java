package com.manytomany.WithoutJoinedEntity.unidirectional.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class SWJBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "swj_book_publisher",
            joinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "publisher_id",referencedColumnName = "id"))
    private Set<SWJPublisher> SWJPublishers;

    public SWJBook(String name, Set<SWJPublisher> SWJPublishers) {
        this.name = name;
        this.SWJPublishers = SWJPublishers;
    }
}
