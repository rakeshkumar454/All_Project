package com.globallogic.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	JdbcTemplate jdbcTemplate;
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void insertData() {
		jdbcTemplate.execute("insert into employee value(3,'Sameer','Software',49000)");
		System.out.println("Inserted");
	}
}
