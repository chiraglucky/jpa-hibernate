package com.manytomany.JoinedEntity.unidirectional.compositeprimary.Repository;

import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity.USCBookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USCBookPublisherRepository extends JpaRepository<USCBookPublisher,Integer> {
}
