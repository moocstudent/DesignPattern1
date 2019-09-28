package before.abstractfactory;

//白狗也实现公共狗
public class WhiteDog extends IDog {
    @Override
    public void eat() {
        System.out.println("白狗吃东西呢~");
    }
}
