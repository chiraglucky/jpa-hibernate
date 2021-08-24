package com.onetoonemapping.SharedPrimaryBidirect.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "sbperson")
public class SBPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "sbPerson")
    private SBIDCard SBIDCard;

    public SBPerson(String name, SBIDCard SBIDCard) {
        this.name = name;
        this.SBIDCard = SBIDCard;
        this.SBIDCard.setSbPerson(this);
    }
}
