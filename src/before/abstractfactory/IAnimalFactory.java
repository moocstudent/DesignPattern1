package before.abstractfactory;

//动物生产工厂
public interface IAnimalFactory {

    ICat createCat();

    IDog createDog();
}
