package com.manytomany.WithoutJoinedEntity.bidirectional.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class BWJBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "bwj_book_publisher",
            joinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "publisher_id",referencedColumnName = "id"))
    private Set<BWJPublisher> bwjPublishers;

    public BWJBook(String name,Set<BWJPublisher> bwjPublishers) {
        this.name = name;
        this.bwjPublishers=bwjPublishers;
    }
}
