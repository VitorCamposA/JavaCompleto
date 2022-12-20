package OO.composicao;


import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Vitor");
        Student student2 = new Student("Joao");
        Student student3 = new Student("Mateus");

        Course course1 = new Course("Java");
        Course course2 = new Course("C");
        Course course3 = new Course("Web");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student2);
        course2.addStudent(student3);

        course3.addStudent(student1);
        course3.addStudent(student3);

        if (course1.students.size() > 0){
            System.out.println("Os alunos que fazem o curso de Java sao: ");
            for (Student student: course1.students ){
                System.out.println(student.name);
            }

        } else{
            System.out.println("Ninguem faz o curso de Java.");
        }

        if (course2.students.size() > 0){
            System.out.println("Os alunos que fazem o curso de C sao: ");
            for (Student student: course2.students ){
                System.out.println(student.name);
            }

        } else{
            System.out.println("Ninguem faz o curso de C.");
        }



        if (course3.students.size() > 0){
            System.out.println("Os alunos que fazem o curso de Web sao: ");
            for (Student student: course3.students ){
                System.out.println(student.name);
            }

        } else{
            System.out.println("Ninguem faz o curso de Web.");
        }

        course3.students.clear();

        if (course3.students.size() > 0){
            System.out.println("Os alunos que fazem o curso de Web sao: ");
            for (Student student: course3.students ){
                System.out.println(student.name);
            }

        } else{
            System.out.println("Ninguem faz o curso de Web.");

        }

        Course courseFound = student1.getCourseByName("Java");

        if (courseFound != null) {
            System.out.println(courseFound.subject);
            System.out.println(courseFound.students);
        }

    }





}

