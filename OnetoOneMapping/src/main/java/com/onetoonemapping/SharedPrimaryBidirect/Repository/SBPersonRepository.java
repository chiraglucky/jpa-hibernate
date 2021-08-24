package com.onetoonemapping.SharedPrimaryBidirect.Repository;

import com.onetoonemapping.SharedPrimaryBidirect.Model.SBPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SBPersonRepository extends JpaRepository<SBPerson,Integer> {
}
