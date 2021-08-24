package com.manytomany.JoinedEntity.bidirectional.singleprimary.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class BSPBookPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date publisherDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private BSPBook bspBook;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher_id")
    private BSPPublisher bspPublisher;

    public BSPBookPublisher(Date publisherDate, BSPBook bspBook, BSPPublisher bspPublisher) {
        this.publisherDate = publisherDate;
        this.bspBook = bspBook;
        this.bspPublisher = bspPublisher;
    }
}
