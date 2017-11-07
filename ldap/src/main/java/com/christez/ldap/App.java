package com.christez.ldap;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App{
    public static void main(String[] args){
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	LdapDao ldapDao = context.getBean("ldapDao", LdapDao.class);
    	
    	List<String> list = ldapDao.getConsumer("7399");
    	
    	for(String tmp : list)
    		System.out.println(tmp);
    }
}
