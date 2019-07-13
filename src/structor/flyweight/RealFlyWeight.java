package structor.flyweight;

public class RealFlyWeight extends FlyWeight{
    @Override
    public void exam() {
        System.out.println(this.getSubjectl()+"is exmaing");
    }

    public RealFlyWeight(String subjectl) {
        super(subjectl);
    }
}
