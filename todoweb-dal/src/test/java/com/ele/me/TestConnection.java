/*
 * Ele.me
 */
/**
 * Ele.me
 */
package com.ele.me;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author nihuihua
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-dal.xml" })
public class TestConnection {
	
	@Autowired
	private ComboPooledDataSource dataSource;
	
	@Test
	public void testGetConnection(){
		try {
			Connection connection = dataSource.getConnection();
			assertNotNull(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
