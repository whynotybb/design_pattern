package behavior.observer;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public void finish(){
        System.out.println(name+"交卷");
    }
}
