package com.onetomany.bidirectional.Repository;

import com.onetomany.bidirectional.Model.BBookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BBookCategoryRepository extends JpaRepository<BBookCategory,Integer> {
}
