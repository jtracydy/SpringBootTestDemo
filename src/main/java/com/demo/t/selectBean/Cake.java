package com.demo.t.selectBean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cake implements Dessert {
	public void sys() {
		System.out.println("Cake.......");
	}
}
