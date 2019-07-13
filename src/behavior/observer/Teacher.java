package behavior.observer;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    private Set<Student> students=new HashSet<>();
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void doNotify(){
        for (Student student:students){
            student.finish();
        }
    }

    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Student student=new Student("Zhansan");
        Student student1=new Student("Lisi");
        teacher.addStudent(student);
        teacher.addStudent(student1);
        teacher.doNotify();
    }
}
