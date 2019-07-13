package behavior.strategy;

public class Add implements Strategy{
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
