package com.klef.jfsd.exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController 
{
  public static void main(String []srgs)
  {
   
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    System.out.println("##### Student and counselor details ######");
    
    Student s=(Student)context.getBean("studentbean");
    System.out.println();
    System.out.println(s.toString());
    
    System.out.println();
    
    System.out.println("################### Counselor Details  #############");
    System.out.println();
    System.out.println(s.getCounselor());
    
    System.out.println();
    
    System.out.println("################### Student Details  #############");
    System.out.println();
    System.out.println("Id :"+s.getId());
    System.out.println("Name: "+s.getName());
    System.out.println("Age :"+s.getAge());
    System.out.println("Gender :"+s.getGender());
    
    context.close();
  }
}