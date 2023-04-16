package com.vrx;

import com.vrx.model.Employee;
import com.vrx.model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Using XML file for values");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println();
        System.out.println("Using @Value annotation");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
