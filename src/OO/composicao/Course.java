package OO.composicao;


import java.util.ArrayList;
import java.util.List;

public class Course {

    final String subject;
    final List<Student> students = new ArrayList<>();

    Course(String subject){
        this.subject = subject;
    }
   void addStudent(Student student){
       this.students.add(student);
       student.courses.add(this);

   }

    public String toString(){
        return this.subject;
    }

}
