package com.klef.jfsd.HCQL;

import java.util.*;


import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;



public class HCQLDemo 
{
public static void main(String args[]) {
		
		HCQLDemo demo = new HCQLDemo();
		demo.insertproduct();
		demo.printadminobject();
		
	}

public void insertproduct()
{
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee id");
    int id = sc.nextInt();
    
    System.out.println("Enter Name");
    String name = sc.next();
    
    System.out.println("Enter salary");
    Boolean bool = sc.nextBoolean();
    
    Employee emp = new Employee();
    emp.setId(id);
    emp.setName(name);
    emp.setPromotion(bool);
    
    Transaction t = session.beginTransaction();
    session.save(emp);
    t.commit();
    
    System.out.println("Employee Object Saved Successfully");
    
    session.close();
    sf.close();
    
}

      public void printadminobject() 
      {
    	  Configuration cfg = new Configuration();
    	    cfg.configure("hibernate.cfg.xml");
    	    
    	    SessionFactory sf = cfg.buildSessionFactory();
    	    Session session = sf.openSession();
    	  
    	  
    	  Criteria c9 = session.createCriteria(Employee.class );
    	  
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("Enter Employee id to find ");
    	    int id = sc.nextInt();
    	  
    	  
          c9.add(Restrictions.idEq(id));// id property equals to 1002
          List<Admin> plist9 = c9.list();
          
          System.out.println("*****ID eq Restriction*****");
          System.out.println("Id which is equal to our restriction"+plist9.size());
          
          
          if(plist9.size()>0) 
          {
          	for(Admin p:plist9) 
          	{
          		System.out.println(p.toString());
          	}
          }
          
          else 
          {
          	System.out.println("Employee Data Not Found");
          }
          
          
          
      }


}
