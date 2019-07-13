package behavior.command;

import javax.activation.CommandMap;

public class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void execute() {
        this.receiver.doSomething();
    }

    public static void main(String[] args) {
        Command command=new ConcreteCommand(new Receiver());
        command.execute();
    }
}
