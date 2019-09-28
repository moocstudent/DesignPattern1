package new_pattern_blog.first.builder;

public class CarDirector {
    public Car ConstructCar(ICarBuilder builder){
        builder.buildEngine();
        builder.buildSkeleton();
        builder.buildWheel();
        return builder.buildCar();
    }
}
