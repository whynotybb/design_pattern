package creator.singleton;

import creator.easy_factory.Ball;
import creator.easy_factory.Soccer;

public class SingletonDemo {
    public static Ball ball;
    public static Ball getBall(){
        if (ball==null){
            synchronized (SingletonDemo.class){
                if (ball==null){
                    ball=new Soccer("足球");
                }
            }
        }
        return ball;
    }
}
