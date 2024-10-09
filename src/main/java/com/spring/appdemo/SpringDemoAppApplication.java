package com.spring.appdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringDemoAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp = (Employee) context.getBean("emp");
        System.out.println("name is : " + emp.printName());
        System.out.println("age is : " + emp.getAge());
        System.out.println("salary is : " + emp.getSalary());
        System.out.println("position is : " + emp.getPosition());
        System.out.println("bean name is : " + emp.getName());
        System.out.println("dept name is : " + emp.getDepartment().getName());
        SpringApplication.run(SpringDemoAppApplication.class, args);

    }




}
