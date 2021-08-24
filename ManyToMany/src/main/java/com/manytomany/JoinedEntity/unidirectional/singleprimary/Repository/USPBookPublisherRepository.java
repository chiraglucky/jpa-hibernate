package com.manytomany.JoinedEntity.unidirectional.singleprimary.Repository;

import com.manytomany.JoinedEntity.unidirectional.singleprimary.Entity.USPBookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USPBookPublisherRepository extends JpaRepository<USPBookPublisher,Integer> {
}
