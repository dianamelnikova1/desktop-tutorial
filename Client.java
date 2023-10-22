package ass3;

public class Client {
    public static void main(String[] args) {

        Adapter adapter = new Adapter(new Adaptee());

        adapter.doSomething();
    }
}
