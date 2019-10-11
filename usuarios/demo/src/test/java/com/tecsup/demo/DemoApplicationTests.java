package com.tecsup.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.tecsup.controller"})
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
