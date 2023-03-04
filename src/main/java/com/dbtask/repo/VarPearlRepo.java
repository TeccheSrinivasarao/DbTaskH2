package com.dbtask.repo;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dbtask.dao.VarPearlFeed;

@Repository
public interface VarPearlRepo extends JpaRepository<VarPearlFeed, Long>{

	@Query(value =  "SELECT SUM(REPORTED_AMOUNT) FROM VAR_PERL_FEED WHERE YEAR1 = :year", nativeQuery = true)
	BigDecimal sumAmount(@Param("year") String year);

	@Query(value =  "SELECT COUNT(REPORTED_AMOUNT) FROM VAR_PERL_FEED WHERE REPORTED_AMOUNT > 0 and YEAR1 = :year", nativeQuery = true)
	BigDecimal countAmount(String year);

}
