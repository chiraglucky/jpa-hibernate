package com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity;

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
public class USCBookPublisherId implements Serializable {
    @Column(name = "book_id")
    private Integer uscBookId;

    @Column(name = "publisher_id")
    private Integer uscPublisherId;
}
