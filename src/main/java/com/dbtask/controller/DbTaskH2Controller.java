package com.dbtask.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbtask.service.DbTaskH2Service;

@RestController
public class DbTaskH2Controller {

	@Autowired
	private DbTaskH2Service service;

	@GetMapping(path = "/sum/{year}")
	public String getSum(@PathVariable(name = "year") String year) {

		BigDecimal response = null;
		response = service.getSum(year);
		if (response != null) {
			return String.valueOf(response);
		} else {
			return "No Record Found with year: " + year;
		}
	}

	@GetMapping(path = "/count/{year}")
	public BigDecimal getCount(@PathVariable(name = "year") String year) {
		BigDecimal response = service.getCount(year);
		return response;
	}

}
