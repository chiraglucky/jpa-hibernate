package com.onetoonemapping.SharedPrimaryBidirect.Model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "sbidcard")
public class SBIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "sbPerson_id")
    @MapsId //maps to parent entity primary key
    private SBPerson sbPerson;

    @Column(unique = true,nullable = false)
    private String code= UUID.randomUUID().toString();

}