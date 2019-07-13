package structor.proxy;

public class People implements Buy{
    @Override
    public void buyCar() {
        System.out.println("You get a car");
    }
}
