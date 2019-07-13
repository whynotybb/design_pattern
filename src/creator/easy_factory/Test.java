package creator.easy_factory;

public class Test {
    public static void main(String[] args) {
        Ball soccer=EasyBallFactory.create("soccer");
        Ball basket=EasyBallFactory.create("basketball");
        System.out.println(soccer.print());
        System.out.println(basket.print());
    }
}
