package creator.builder;

public class XiaoMiBuilder extends Builder{
    private Computer computer=new Computer();
    @Override
    void buildCPU() {
        computer.setCpu(new IntelCPU());
    }

    @Override
    void buildMainBoard() {
        computer.setMainBoard(new AMainBoard());
    }

    @Override
    void buildDisPlayer() {
       computer.setDisPlayer(new ADisPlayer());
    }

    @Override
    Computer createComputer() {
        return computer;
    }
}
