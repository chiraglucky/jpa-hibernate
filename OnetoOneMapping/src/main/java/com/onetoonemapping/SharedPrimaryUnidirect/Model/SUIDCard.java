package com.onetoonemapping.SharedPrimaryUnidirect.Model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "suidcard")
public class SUIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "sbPerson_id",referencedColumnName = "id")
    @MapsId //maps to parent entity primary key
    private SUPerson SUPerson;

    @Column(unique = true,nullable = false)
    private String code= UUID.randomUUID().toString();

    public SUIDCard(SUPerson person) {
        this.SUPerson = person;
    }
}