package before.abstractfactory;

/**
 * 公共猫接口
 */
public abstract class ICat implements IAnimals{
    @Override
    public void eat(){
        System.out.println("猫吃鱼.");
    }

    @Override
    public void say(){
        System.out.println("喵~~");
    }
}
