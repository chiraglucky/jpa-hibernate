package com.manytomany.JoinedEntity.bidirectional.compositeprimary.Repository;

import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity.BSCBookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSCBookPublisherRepository extends JpaRepository<BSCBookPublisher,Integer> {
}
