package com.manytomany.JoinedEntity.bidirectional.singleprimary.Repository;

import com.manytomany.JoinedEntity.bidirectional.singleprimary.Entity.BSPBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSPBookRepository extends JpaRepository<BSPBook,Integer> {
}
