package com.dbtask.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "var_perl_feed")
@Data
public class VarPearlFeed {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String year1;

	@Column(name = "reported_amount")
	private Double amount;
}
