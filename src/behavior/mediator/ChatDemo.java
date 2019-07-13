package behavior.mediator;

public class ChatDemo {
    public static void main(String[] args) {
      User user=new User("斌");
      User user1=new User("霞");
      user.sendMessage("hello xiaoxia");
      user1.sendMessage("hello love you guys");
    }
}
