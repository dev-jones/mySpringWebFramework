package com.devjones.web.jdbc;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCTest {

	private Logger LOG = LoggerFactory.getLogger(this.getClass());	// this.getClass()대신 HappyController.class가능
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL", "C##YONGHO", "highland")) {
			
			LOG.info("conn : " + conn);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
}
