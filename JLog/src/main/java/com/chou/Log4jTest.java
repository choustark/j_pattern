package com.chou;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

/**
 * @author Chou
 * @version 1.0
 * @description TODO
 * @className Log4jTest
 * @date 2024/3/24 15:42
 **/

public class Log4jTest {

	public static final Logger log = LogManager.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		log.isEnabled(Level.INFO);
		log.info("这是一个info 日志！！！");
		log.debug("这是一个debug 日志！！！");
		log.error("这是一个error 日志！！！");
		log.fatal("这是一个fatal 日志！！！");
	}

	public static String  function1(String name,String userId,String customerId){

		return null;
	}
}
