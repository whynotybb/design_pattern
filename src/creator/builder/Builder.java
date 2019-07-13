package creator.builder;

public abstract class Builder {
    abstract void buildCPU();
    abstract void buildMainBoard();
    abstract void buildDisPlayer();
    abstract Computer createComputer();
}
