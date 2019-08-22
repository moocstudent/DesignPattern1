package abstractfactory;

public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("黑狗在吃东西~");
    }
}
