package com.manytomany.JoinedEntity.unidirectional.compositeprimary.Repository;

import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity.USCBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USCBookRepository extends JpaRepository<USCBook,Integer> {
}
