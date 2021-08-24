package com.manytomany.JoinedEntity.bidirectional.compositeprimary.Repository;

import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity.BSCBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSCBookRepository extends JpaRepository<BSCBook,Integer> {
}
