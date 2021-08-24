package com.onetomany.unidirectional.onetomany.Repository;

import com.onetomany.unidirectional.onetomany.Model.UBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UBookRepository extends JpaRepository<UBook,Integer> {
}
