package creator.builder;

public class Computer {
    private CPU cpu;//cpu 是个接口，有不同实现如InterCPU AMDCPU 等等
    private MainBoard mainBoard;//mainBoard 是个接口，有不同的实现
    private DisPlayer disPlayer;//disPlayer 是个接口，有不同的实现

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public DisPlayer getDisPlayer() {
        return disPlayer;
    }

    public void setDisPlayer(DisPlayer disPlayer) {
        this.disPlayer = disPlayer;
    }
}