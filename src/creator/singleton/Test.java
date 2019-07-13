package creator.singleton;

import creator.easy_factory.Ball;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            service.execute(()->{
                Ball ball= SingletonDemo.getBall();
                ball.print();
                System.out.println(Thread.currentThread().getName()+":"+ball.toString());
            });
        }
        service.shutdown();
    }
}
