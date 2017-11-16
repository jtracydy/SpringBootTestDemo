package com.demo.a.t.s33.selectBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.demo.a.config.BaseTestCase;

public class Test extends BaseTestCase{
	private Dessert dessert;

	public Dessert getDessert() {
		return dessert;
	}

	@Autowired
	@Qualifier("iceCream")
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
    
	@org.junit.Test
	public void test(){
		dessert.sys();
	}
}
