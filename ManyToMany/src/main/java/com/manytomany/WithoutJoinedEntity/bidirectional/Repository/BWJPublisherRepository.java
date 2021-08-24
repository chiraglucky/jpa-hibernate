package com.manytomany.WithoutJoinedEntity.bidirectional.Repository;

import com.manytomany.WithoutJoinedEntity.bidirectional.Entity.BWJPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BWJPublisherRepository extends JpaRepository<BWJPublisher,Integer> {
}
