package structor.proxy;

public class ProxyPeople implements Buy{
    private People people;

    public ProxyPeople(People people) {
        this.people = people;
    }

    @Override
    public void buyCar() {
        System.out.println("4S点帮你上税，上保险");
        people.buyCar();
    }

    public static void main(String[] args) {
        Buy buy =new ProxyPeople(new People());
        buy.buyCar();
    }
}
