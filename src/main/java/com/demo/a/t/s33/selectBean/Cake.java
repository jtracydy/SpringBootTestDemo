package com.demo.a.t.s33.selectBean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cake implements Dessert {
	public void sys() {
		System.out.println("Cake.......");
	}
}
