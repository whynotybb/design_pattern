package creator.builder;

public class IntelCPU implements CPU{
    @Override
    public void complete() {
        System.out.println("Intel CPU can implement 1000000/s");
    }
}
