package com.onetomany.unidirectional.onetomany.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ULibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<UBook> uBooks;

    public ULibrary() {
        super();
    }

    public ULibrary(String name, Set<UBook> uBooks) {
        this.name = name;
        this.uBooks = uBooks;
    }

    public ULibrary(int id, String name, Set<UBook> uBooks) {
        this.id = id;
        this.name = name;
        this.uBooks = uBooks;
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

    public Set<UBook> getuBooks() {
        return uBooks;
    }

    public void setuBooks(Set<UBook> uBooks) {
        this.uBooks = uBooks;
    }

    @Override
    public String toString() {
        return "ULibrary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uBooks=" + uBooks +
                '}';
    }
}
