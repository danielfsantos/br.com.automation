package com.automation.br.com.automation.config;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Hooks {

	@BeforeClass
	public void setUp(){
		System.out.println("Hooks funcionando");
	}

	@Test
	public void test() {
		
	}

	

}
