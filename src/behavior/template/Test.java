package behavior.template;

public class Test {
    public static void main(String[] args) {
       DBTemplate dbTemplate=new MysqlTemplate();
       dbTemplate.selectTemplate();
    }
}
