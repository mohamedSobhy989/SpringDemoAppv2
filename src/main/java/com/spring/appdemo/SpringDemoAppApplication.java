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
        System.out.println( " name is : " + emp.printName() +
                            " and age is : " + emp.getAge()+
                            " and salary is : " + emp.getSalary() +
                            " and position is : " + emp.getPosition() +
                            " and bean name is : " + emp.getName() +
                            " and dept name is : " + emp.getDepartment().getName() +
                            " and address 1 is " + emp.getDepartment().getAddress().get(0).getName() +
                            " and address 2 is " + emp.getDepartment().getAddress().get(1).getName());
        SpringApplication.run(SpringDemoAppApplication.class, args);

    }




}
