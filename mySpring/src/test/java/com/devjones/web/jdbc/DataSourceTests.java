package com.devjones.web.jdbc;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring/root-context.xml")
public class DataSourceTests {

	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
//	@Test
//	public void testConnection() {
//		
//		try(Connection conn = dataSource.getConnection()) {
//			
//			LOG.info("conn : " + conn);
//		} catch (SQLException e) {
//			
//			fail(e.getMessage());
//		}
//	}
	
	@Test
	public void testMyBatis() {
		
		try(SqlSession session = sqlSessionFactory.openSession();
				Connection conn = session.getConnection();) {
			
			System.out.println(session);
			System.out.println(conn);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
