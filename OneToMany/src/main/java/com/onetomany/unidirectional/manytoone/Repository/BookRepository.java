package com.onetomany.unidirectional.manytoone.Repository;

import com.onetomany.unidirectional.manytoone.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
