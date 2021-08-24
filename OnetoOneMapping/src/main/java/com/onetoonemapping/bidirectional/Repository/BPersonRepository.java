package com.onetoonemapping.bidirectional.Repository;

import com.onetoonemapping.bidirectional.Model.BPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BPersonRepository extends JpaRepository<BPerson,Integer> {
}
