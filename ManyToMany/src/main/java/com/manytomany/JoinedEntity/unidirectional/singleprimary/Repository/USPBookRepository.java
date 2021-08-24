package com.manytomany.JoinedEntity.unidirectional.singleprimary.Repository;

import com.manytomany.JoinedEntity.unidirectional.singleprimary.Entity.USPBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USPBookRepository extends JpaRepository<USPBook,Integer> {
}
