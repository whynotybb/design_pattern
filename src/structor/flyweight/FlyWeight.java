package structor.flyweight;

public abstract class FlyWeight {
    //内部状态：
    private String name;
    private Integer age;
    //外部状态
    private final String subjectl;

    public FlyWeight(String subjectl) {
        this.subjectl = subjectl;
    }

    //行为
    public abstract void exam();

    public String getSubjectl() {
        return subjectl;
    }
}
