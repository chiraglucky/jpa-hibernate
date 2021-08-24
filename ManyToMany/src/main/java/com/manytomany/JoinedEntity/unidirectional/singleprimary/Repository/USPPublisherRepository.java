package com.manytomany.JoinedEntity.unidirectional.singleprimary.Repository;

import com.manytomany.JoinedEntity.unidirectional.singleprimary.Entity.USPPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USPPublisherRepository extends JpaRepository<USPPublisher,Integer> {
}
