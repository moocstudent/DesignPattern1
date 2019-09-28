package before.bridging;

public class Jacket extends Clothing{
    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType()+"穿马甲");
    }
}
