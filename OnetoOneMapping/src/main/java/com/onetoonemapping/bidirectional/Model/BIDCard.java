package com.onetoonemapping.bidirectional.Model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "bidcard")
public class BIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String code= UUID.randomUUID().toString();

    @OneToOne(mappedBy = "BIDCard") //(bidirectional mapping) points to the relationship owner
    private BPerson BPerson;
}