package com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity;

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
public class BSCBookPublisher {

    @EmbeddedId
    private BSCBookPublisherId id;

    private Date publisherDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("bscBookId")
    @JoinColumn(name = "book_id")
    private BSCBook BSCBook;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("bscPublisherId")
    @JoinColumn(name = "publisher_id")
    private BSCPublisher BSCPublisher;

    public BSCBookPublisher(Date publisherDate, BSCBook BSCBook, BSCPublisher BSCPublisher) {
        this.id=new BSCBookPublisherId(BSCBook.getId(),BSCPublisher.getId());
        this.publisherDate = publisherDate;
        this.BSCBook = BSCBook;
        this.BSCPublisher = BSCPublisher;
    }
}
