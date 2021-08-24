package com.onetoonemapping.Unidirectional.Repository;

import com.onetoonemapping.Unidirectional.Model.UPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UPersonRepository extends JpaRepository<UPerson,Integer> {
}
