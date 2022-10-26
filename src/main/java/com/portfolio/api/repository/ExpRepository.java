package com.portfolio.api.repository;

import com.portfolio.api.model.Exp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Exp,Long>{
    
}
