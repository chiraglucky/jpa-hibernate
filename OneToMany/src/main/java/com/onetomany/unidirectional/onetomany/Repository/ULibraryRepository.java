package com.onetomany.unidirectional.onetomany.Repository;

import com.onetomany.unidirectional.onetomany.Model.ULibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ULibraryRepository extends JpaRepository<ULibrary,Integer> {
}
