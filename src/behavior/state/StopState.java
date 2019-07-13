package behavior.state;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
