/*
 * Ele.me
 */
/**
 * Ele.me
 */
package com.ele.me;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import com.ele.me.RedisClient;

/**
 * @author nihuihua
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:pylon.xml"})
public class RedisTest {
	@Autowired
	private JedisPool jedisPool;
	
	@Test
	public void testGetConnection(){
		Jedis client = jedisPool.getResource();
		assertNotNull(client);
	}

}
