package abstractfactory;

public class BlackCat implements ICat {
    @Override
    public void eat() {
        System.out.println("黑猫吃东西~");
    }
}
