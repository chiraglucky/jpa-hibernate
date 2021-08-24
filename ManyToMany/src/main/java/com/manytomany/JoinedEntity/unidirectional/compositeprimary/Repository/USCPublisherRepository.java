package com.manytomany.JoinedEntity.unidirectional.compositeprimary.Repository;

import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity.USCPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USCPublisherRepository extends JpaRepository<USCPublisher,Integer> {
}
