package new_pattern_blog.first.builder;

public class MainTest {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        Car car = director.ConstructCar(new ConcreteBuilder());
        System.out.println(car.getWheel());
        System.out.println(car.getEngine());
        System.out.println(car.getSkeleton());
    }
}
