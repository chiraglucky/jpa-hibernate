package com.onetomany.unidirectional.onetomany.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class UBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    public UBook() {
        super();
    }

    public UBook(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UBook(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
