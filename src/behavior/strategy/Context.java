package behavior.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int execute(int a,int b){
        return strategy.operate(a,b);
    }
    public static void main(String[] args) {
       Context context=new Context(new Add());
        System.out.println(context.execute(8,4));
        context=new Context(new Substract());
        System.out.println(context.execute(8,4));
    }
}
