package com.demo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.demo.a.config.BaseTestCase;
import com.demo.t.s03.s032.conditional.MagicConfig;

public class ConditionalTest extends BaseTestCase {

	@Autowired
	private MagicConfig magicConfig;

	@Autowired

	@Test
	public void shouldNotBeNull() {
		System.out.println(magicConfig.str);
	}
}
