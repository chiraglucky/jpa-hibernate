package com.manytomany.WithoutJoinedEntity.unidirectional.Repository;

import com.manytomany.WithoutJoinedEntity.unidirectional.Entity.SWJPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SWJPublisherRepository extends JpaRepository<SWJPublisher,Integer> {
}
