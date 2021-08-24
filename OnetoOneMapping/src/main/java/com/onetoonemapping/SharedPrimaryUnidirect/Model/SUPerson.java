package com.onetoonemapping.SharedPrimaryUnidirect.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "superson")
public class SUPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public SUPerson(String name) {
        this.name = name;
    }
}
