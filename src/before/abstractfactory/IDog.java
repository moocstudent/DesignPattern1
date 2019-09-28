package before.abstractfactory;

/**
 * 公共狗接口
 */
public abstract class IDog implements IAnimals {
    @Override
    public void eat(){
        System.out.println("狗吃骨头.");
    }

    @Override
    public void say(){
        System.out.println("汪!");
    }
}
