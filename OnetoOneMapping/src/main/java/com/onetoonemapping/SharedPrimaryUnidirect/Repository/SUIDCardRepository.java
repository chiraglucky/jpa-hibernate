package com.onetoonemapping.SharedPrimaryUnidirect.Repository;

import com.onetoonemapping.SharedPrimaryUnidirect.Model.SUIDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SUIDCardRepository extends JpaRepository<SUIDCard,Integer> {
}
