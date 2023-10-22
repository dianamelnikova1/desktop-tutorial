package ass3;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        adaptee.doSomethingElse();
    }
}
