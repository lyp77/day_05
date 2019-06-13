package com.test.USer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testClass {
		@Test
		public void testdoem() {
			ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
			Userdao userService= (Userdao) context.getBean("dao");
			userService.add();
		}
}
