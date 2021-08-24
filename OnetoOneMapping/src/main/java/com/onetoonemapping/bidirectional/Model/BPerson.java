package com.onetoonemapping.bidirectional.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name="bperson")
public class BPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "id_card_id") //foreignkey column
    private BIDCard BIDCard;

    public BPerson(String name, BIDCard BIDCard) {
        this.name = name;
        this.BIDCard = BIDCard;
    }
}
