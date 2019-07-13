package creator.easy_factory;

public class EasyBallFactory {
    public static Ball create(String name){
        if ("soccer".equals(name)){
            return new Soccer(name);
        }
        if ("basketball".equals(name)){
            return new BasketBall(name);
        }
        return null;
    }
}
