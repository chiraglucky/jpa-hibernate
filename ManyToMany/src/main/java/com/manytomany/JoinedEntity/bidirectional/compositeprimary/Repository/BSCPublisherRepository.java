package com.manytomany.JoinedEntity.bidirectional.compositeprimary.Repository;

import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity.BSCPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSCPublisherRepository extends JpaRepository<BSCPublisher,Integer> {
}
