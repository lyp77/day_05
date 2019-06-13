package com.test.USer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class UserService {
		@After(value="execution(* com.test.USer.Userdao.*(..))")
		public void add() {
			System.out.println(12);
		}
}
