/*
        100040X
        Arukgoda J.S.
        Programming Challenge
*/
        package sms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("smsContext.xml");
        StudentRepository ssp = new SimpleStudentRepository();
        StudentManagementSystem sms = new StudentManagementSystem(ssp);
        ssp.saveStudent((Student)c.getBean("s1"));
        ssp.saveStudent((Student)c.getBean("s2"));
        ssp.saveStudent((Student)c.getBean("s3"));
        ssp.saveStudent((Student)c.getBean("s4"));
        ssp.saveStudent((Student)c.getBean("s5"));
        ssp.saveStudent((Student)c.getBean("s6"));
        sms.listAllStudents();

    }

}
