package com.dbtask.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbtask.repo.VarPearlRepo;

@Service
public class DbTaskH2ServiceImpl implements DbTaskH2Service {

	@Autowired
	private VarPearlRepo repo;

	@Override
	public BigDecimal getSum(String year) {

		return repo.sumAmount(year);
	}

	@Override
	public BigDecimal getCount(String year) {
		return repo.countAmount(year);
	}

}
