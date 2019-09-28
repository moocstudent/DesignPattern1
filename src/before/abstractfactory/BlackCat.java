package before.abstractfactory;

//黑猫也是猫,所以它把公共猫接口进行了实现
public class BlackCat extends ICat {
    @Override
    public void eat() {
        System.out.println("黑猫吃东西~");
    }

}
