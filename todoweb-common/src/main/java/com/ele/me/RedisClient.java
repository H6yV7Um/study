/*
 * Ele.me
 */

package com.ele.me;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import me.ele.elog.Log;
import me.ele.elog.LogFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;

/**
 * Created by paul on 2017/4/7.
 * redis 客户端
 */
public class RedisClient {

    private static final Log LOGGER = LogFactory.getLog(RedisClient.class);

    public JedisPool jedisPool;

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    /**
     * 查找缓存对象
     *
     * @param key
     * @return
     */
    public Object getObjByKey(String key) {
        Jedis client = jedisPool.getResource();
        Object o = null;
        try {
            o = client.get(key);
        } finally {
            client.close();
        }
        return o;
    }

    /**
     * 查找缓存字符串
     *
     * @param key
     * @return
     */
    public String getStrByKey(String key) {
        Jedis client = jedisPool.getResource();
        try {
            return client.get(key);
        } finally {
            client.close();
        }
    }

    /**
     * String类型的键值写入redis,并设置失效时间
     *
     * @param key
     * @param value
     * @return
     */
    public boolean setKeyWithExpireTime(String key, String value, int time) {
        Jedis client = jedisPool.getResource();
        String isSuccess = "";
        try {
            isSuccess = client.setex(key, time, value);
            return "OK".equals(isSuccess);
        } finally {
            client.close();
        }
    }

    public List<String> mget(List<String> keys) {
        Jedis client = jedisPool.getResource();
        try {
            return client.mget(keys.toArray(new String[keys.size()]));
        } finally {
            client.close();
        }
    }

    public void msetWithExpireTime(Map<String, String> map, int time) {
        Jedis client = jedisPool.getResource();
        try {
            Pipeline pipeline = client.pipelined();
            map.forEach((k, v) -> {
                pipeline.setex(k, time, v);
            });
            pipeline.sync();
        } finally {
            client.close();
        }
    }

    public <T> T getAnObject(String key, Class<T> zz) {
        Jedis client = jedisPool.getResource();
        T t;
        try {
            String s = client.get(key);
            if (s == null || s.length() == 0) {
                return null;
            }
            t = JSON.parseObject(s, zz);
        } finally {
            jedisPool.returnResource(client);
        }
        return t;
    }

    public Long delKey(String key) {
        Jedis client = jedisPool.getResource();
        try {
            return client.del(key);
        } finally {
            jedisPool.returnResource(client);
        }
    }

}
