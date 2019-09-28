package before.abstractfactory;

/**
 * 白色动物工厂 实现动物生产工厂 start painting the white animals
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
