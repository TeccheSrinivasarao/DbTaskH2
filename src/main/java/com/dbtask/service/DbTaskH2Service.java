package com.dbtask.service;

import java.math.BigDecimal;

public interface DbTaskH2Service {

	BigDecimal getSum(String year);

	BigDecimal getCount(String year);

}
