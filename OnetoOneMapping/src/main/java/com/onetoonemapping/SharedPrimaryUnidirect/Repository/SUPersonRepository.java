package com.onetoonemapping.SharedPrimaryUnidirect.Repository;

import com.onetoonemapping.SharedPrimaryUnidirect.Model.SUPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SUPersonRepository extends JpaRepository<SUPerson,Integer> {
}
