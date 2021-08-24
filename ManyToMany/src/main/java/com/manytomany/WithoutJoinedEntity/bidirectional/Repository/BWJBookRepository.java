package com.manytomany.WithoutJoinedEntity.bidirectional.Repository;

import com.manytomany.WithoutJoinedEntity.bidirectional.Entity.BWJBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BWJBookRepository extends JpaRepository<BWJBook,Integer> {
}
