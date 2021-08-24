package com.onetoonemapping.Unidirectional.Repository;

import com.onetoonemapping.Unidirectional.Model.UIDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UIDCardRepository extends JpaRepository<UIDCard,Integer> {
}
