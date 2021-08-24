package com.onetoonemapping.Unidirectional.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "uperson")
public class UPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "id_card_id") //foreignkey column
    private UIDCard UIDCard;

    public UPerson(String name, UIDCard UIDCard) {
        this.name = name;
        this.UIDCard = UIDCard;
    }
}
