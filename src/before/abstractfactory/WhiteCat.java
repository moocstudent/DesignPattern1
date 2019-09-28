package before.abstractfactory;

//白猫也是猫,所以它也把猫接口进行了实现
public class WhiteCat extends ICat {
    @Override
    public void eat() {
        System.out.println("白猫吃东西呢~");
    }
}
