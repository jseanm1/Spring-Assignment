/*
        100040X
        Arukgoda J.S.
        Programming Challenge
*/
package sms;

import java.util.List;

public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }

   

    public void listAllStudents() {
        
        List<Student> l2 = (List<Student>) repo.findAllStudents();
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(i + ". " + l2.get(i).getRegNumber());
        }
    }

    public void registerStudent(Student stu) {

        repo.saveStudent(stu);
    }
}
