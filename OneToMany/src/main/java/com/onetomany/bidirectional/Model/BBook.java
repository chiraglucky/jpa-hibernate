package com.onetomany.bidirectional.Model;

import javax.persistence.*;

@Entity
public class BBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "book_category_id")
    private BBookCategory BBookCategory;

    public BBook() {

    }

    public BBook(String name) {
        this.name = name;
    }

    public BBook(String name, BBookCategory BBookCategory) {
        this.name = name;
        this.BBookCategory = BBookCategory;
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

    public BBookCategory getBookCategory() {
        return BBookCategory;
    }

    public void setBookCategory(BBookCategory BBookCategory) {
        this.BBookCategory = BBookCategory;
    }
}