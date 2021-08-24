package com.onetomany.unidirectional.manytoone.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.ALL)
    private Library library;

    public Book() {
        super();
    }

    public Book(String name,Library library) {
        this.name = name;
        this.library=library;
    }

    public Book(int id, String name, Library library) {
        this.id = id;
        this.name = name;
        this.library = library;
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

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", library=" + library +
                '}';
    }
}
