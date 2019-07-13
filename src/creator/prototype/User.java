package creator.prototype;

public class User implements Cloneable{
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(this.name,this.age);
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public static void main(String[] args) throws Exception{
        User user1=new User("whynot",25);
        User user2=(User) user1.clone();
        System.out.println(user1);
        System.out.println(user2);
    }
}
