package before.abstractfactory;

/**
 * 黑动物工厂实现了动物生产工厂 内含两个方法,获取黑色的猫/狗
 * As the same as WhiteAnimalFactory , start painting the black animals
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
