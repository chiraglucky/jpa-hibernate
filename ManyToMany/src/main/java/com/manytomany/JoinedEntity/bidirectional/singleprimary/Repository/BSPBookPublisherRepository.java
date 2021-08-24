package com.manytomany.JoinedEntity.bidirectional.singleprimary.Repository;

import com.manytomany.JoinedEntity.bidirectional.singleprimary.Entity.BSPBookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSPBookPublisherRepository extends JpaRepository<BSPBookPublisher,Integer> {
}
