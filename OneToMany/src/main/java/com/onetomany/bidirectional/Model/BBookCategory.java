package com.onetomany.bidirectional.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class BBookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "BBookCategory", cascade = CascadeType.ALL)
    private Set<BBook> BBooks;

    public BBookCategory(){

    }

    public BBookCategory(String name) {
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

    public Set<BBook> getBooks() {
        return BBooks;
    }

    public void setBooks(Set<BBook> BBooks) {
        this.BBooks = BBooks;
    }

}