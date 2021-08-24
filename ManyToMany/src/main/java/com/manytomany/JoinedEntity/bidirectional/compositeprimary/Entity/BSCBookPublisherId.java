package com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


//To create composite key
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class BSCBookPublisherId implements Serializable {
    @Column(name = "book_id")
    private Integer bscBookId;

    @Column(name = "publisher_id")
    private Integer bscPublisherId;
}
