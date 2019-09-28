package before.abstractfactory;

/**
 * 黑动物工厂实现了动物工厂 内含两个方法,获取黑色的猫/狗
 */
public class BlackAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
