package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Department;
import com.model.Employee;

public class Test {

public static void main(String[] args) {
	

Session session=HibernateUtil.getSessionFactory().openSession();
	
Department d=new Department();

d.setDid(12);

d.setDname("xyz");

Department d1=new Department();

d1.setDid(13);

d1.setDname("abc");

Employee e=new Employee();

e.setEid(101);

e.setEname("BK");

e.setD(d);

e.setD(d1);


session.save(e);


session.beginTransaction().commit();
}
	
}
