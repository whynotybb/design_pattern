package structor.adapter;

/**
 * 适配器可以实现少量接口的需求，不需要实现所有接口
 */
public class You extends Adapter{
    @Override
    public void first() {
        super.first();
        System.out.println("first");
    }
}
