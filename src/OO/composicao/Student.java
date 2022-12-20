package OO.composicao;

import java.util.ArrayList;
import java.util.List;

public class Student {

    final String name;
    final List<Course> courses = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    void addCourse(Course course){
        this.courses.add(course);
        course.students.add(this);
    }
    public String toString(){
        return this.name;
    }

    Course getCourseByName(String subject){
        for (Course course : this.courses){
            if(course.subject.equalsIgnoreCase(subject)){
                return course;
            }
        }



        return null;
    }
}
