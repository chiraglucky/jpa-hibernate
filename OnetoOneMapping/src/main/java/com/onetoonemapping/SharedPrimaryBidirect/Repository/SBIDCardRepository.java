package com.onetoonemapping.SharedPrimaryBidirect.Repository;

import com.onetoonemapping.SharedPrimaryBidirect.Model.SBIDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SBIDCardRepository extends JpaRepository<SBIDCard,Integer> {
}
