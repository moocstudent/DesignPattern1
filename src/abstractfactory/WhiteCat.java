package abstractfactory;

public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("白猫吃东西呢~");
    }
}
