package behavior.strategy;

public class Substract implements Strategy{
    @Override
    public int operate(int a, int b) {
        return a-b;
    }
}
