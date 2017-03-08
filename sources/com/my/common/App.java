package com.my.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.emp.bo.EmpBo;
import com.my.emp.model.Emp;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext =
    	  new ClassPathXmlApplicationContext("config/BeanLocations.xml");

    	EmpBo empBo = (EmpBo)appContext.getBean("empBo");

    	/** insert **/
    	Emp emp = new Emp();
    	emp.setDName("HR");
    	emp.setEName("Sachin");
    	empBo.save(emp);

    	/** select **/
    	Emp emp2 = empBo.findByDName("TECH");
    	System.out.println(emp2);

    	/** update **/
    	emp2.setEName("Sunny");
    	empBo.update(emp2);

    	/** delete **/
    	//empBo.delete(emp2);

    	System.out.println("Done");
    }
}
