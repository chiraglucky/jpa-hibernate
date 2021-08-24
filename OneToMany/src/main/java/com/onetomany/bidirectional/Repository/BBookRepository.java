package com.onetomany.bidirectional.Repository;

import com.onetomany.bidirectional.Model.BBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BBookRepository extends JpaRepository<BBook,Integer> {
}
