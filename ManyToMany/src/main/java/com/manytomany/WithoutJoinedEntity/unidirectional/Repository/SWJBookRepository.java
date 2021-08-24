package com.manytomany.WithoutJoinedEntity.unidirectional.Repository;

import com.manytomany.WithoutJoinedEntity.unidirectional.Entity.SWJBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SWJBookRepository extends JpaRepository<SWJBook,Integer> {
}
