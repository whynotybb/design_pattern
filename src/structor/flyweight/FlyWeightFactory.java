package structor.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 避免反复创建对象，将对象缓存起来
 */
public class FlyWeightFactory {
    private static Map<String,FlyWeight> pool=new HashMap<>();

    public static FlyWeight getFlyWeight(String subject){
        if (pool.get(subject)!=null){
            return pool.get(subject);
        }else {
            FlyWeight flyWeight=new RealFlyWeight(subject);
            pool.put(subject,flyWeight);
            return flyWeight;
        }
    }

    public static void main(String[] args) {
        System.out.println(pool.size());
        FlyWeight flyWeight= getFlyWeight("Math");
        flyWeight.exam();
        FlyWeight flyWeight1= getFlyWeight("Language");
        flyWeight1.exam();
        FlyWeight flyWeight2= getFlyWeight("English");
        flyWeight2.exam();
        System.out.println(pool.size());
    }
}
