package com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

//create bookpublisher as JoinedEntity with Composite primary key as BSCBookPublisherId
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class USCBookPublisher {

    @EmbeddedId
    private USCBookPublisherId id;

    private Date publisherDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("uscBookId")
    @JoinColumn(name = "book_id")
    private USCBook USCBook;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("uscPublisherId")
    @JoinColumn(name = "publisher_id")
    private USCPublisher USCPublisher;

    public USCBookPublisher(Date publisherDate, USCBook USCBook, USCPublisher USCPublisher) {
        this.id=new USCBookPublisherId(USCBook.getId(), USCPublisher.getId());
        this.publisherDate = publisherDate;
        this.USCBook = USCBook;
        this.USCPublisher = USCPublisher;
    }
}
