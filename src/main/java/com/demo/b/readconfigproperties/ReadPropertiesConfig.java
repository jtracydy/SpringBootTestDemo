package com.demo.b.readconfigproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.demo.a.entity.User;

/**
 * 读取配置文件
 * 
 * @author dan.wang
 *
 */
@Configuration
@PropertySource("classpath:/config/config.properties")
public class ReadPropertiesConfig {

	@Autowired
	Environment evn;

	@Value("${magic}")
	private String str;

	public void getProperties() {
		String magic = evn.getProperty("magic");
		System.out.println(magic);
		System.out.println(str);
	}

}
