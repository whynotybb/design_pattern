package structor.bridge;

import creator.easy_factory.Ball;
import creator.easy_factory.BasketBall;
import creator.easy_factory.Soccer;

/**
 * 将两个不同的对象耦合在一起
 */
public class BallCut {
    private Ball ball;

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void create(){
        System.out.println(ball.print());
    }

    public static void main(String[] args) {
        BallCut ballCut=new BallCut();
        ballCut.setBall(new Soccer("soccer"));
        System.out.println(ballCut.getBall().print());
        ballCut.setBall(new BasketBall("basketball"));
        System.out.println(ballCut.getBall().print());
    }
}
