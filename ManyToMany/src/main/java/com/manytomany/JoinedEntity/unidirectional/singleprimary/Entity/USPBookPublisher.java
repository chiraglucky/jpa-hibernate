package com.manytomany.JoinedEntity.unidirectional.singleprimary.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class USPBookPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date publisherDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private USPBook USPBook;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher_id")
    private USPPublisher USPPublisher;

    public USPBookPublisher(Date publisherDate, USPBook USPBook, USPPublisher USPPublisher) {
        this.publisherDate = publisherDate;
        this.USPBook = USPBook;
        this.USPPublisher = USPPublisher;
    }
}
