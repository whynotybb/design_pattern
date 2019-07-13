package creator.easy_factory;

public class Soccer implements Ball{
    private String name;

    public String getName() {
        return name;
    }

    public Soccer(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "This is a soccer";
    }
}
