package com.demo.t.s03.selectBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class IceCream implements Dessert {
	private static final Logger log = LoggerFactory.getLogger(IceCream.class);

	public void sys() {
		log.info("log....................");
		System.out.println("ice.......");
	}
}
