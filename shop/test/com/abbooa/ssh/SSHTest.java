package com.abbooa.ssh;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSHTest {

	
	@Test
	public void spring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		System.out.println(context.getBean("date"));	
	}
	
	@Test
	public void hibernate(){
		Session session = HibernateSessionFactory.getSession();
		System.out.println(session);
	}
	
	
	/*
	 * Spring管理Hibernate，采用aop实现声明式事务
	 * 
	 * 加载spring与hibernate整合的jar包
	 */
	@Test
	public void springHibernate(){
		
	}
}
 