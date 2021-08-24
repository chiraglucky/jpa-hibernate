package com.manytomany.JoinedEntity.bidirectional.singleprimary.Repository;

import com.manytomany.JoinedEntity.bidirectional.singleprimary.Entity.BSPPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSPPublisherRepository extends JpaRepository<BSPPublisher,Integer> {
}
