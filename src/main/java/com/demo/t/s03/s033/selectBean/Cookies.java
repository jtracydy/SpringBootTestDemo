package com.demo.t.s03.s033.selectBean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cookies implements Dessert{
   
	public void sys() {
		System.out.println("Cookies.......");
	}
}
