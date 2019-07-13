package creator.easy_factory;

public class BasketBall implements Ball{
    private String name;

    public String getName() {
        return name;
    }

    public BasketBall(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "This is a basketball";
    }
}
