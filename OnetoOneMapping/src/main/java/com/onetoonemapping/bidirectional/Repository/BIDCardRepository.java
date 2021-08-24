package com.onetoonemapping.bidirectional.Repository;

import com.onetoonemapping.bidirectional.Model.BIDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BIDCardRepository extends JpaRepository<BIDCard,Integer> {
}
