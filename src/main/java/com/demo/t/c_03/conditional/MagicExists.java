package com.demo.t.c_03.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 当@Conditional后面条件为真时，创建bean
 * 
 * @author dan.wang
 *
 */
@Configuration
public class MagicExists {

	@Bean()
	@Conditional(MagicCondition.class)
	public MagicConfig magicBean() {
		return new MagicConfig();
	}

}
