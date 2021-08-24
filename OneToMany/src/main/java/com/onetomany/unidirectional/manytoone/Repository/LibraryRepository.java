package com.onetomany.unidirectional.manytoone.Repository;

import com.onetomany.unidirectional.manytoone.Model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
