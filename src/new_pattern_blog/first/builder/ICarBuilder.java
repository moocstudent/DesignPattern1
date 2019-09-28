package new_pattern_blog.first.builder;

//抽象建造者
public interface ICarBuilder {
    public void buildWheel();
    public void buildSkeleton();
    public void buildEngine();

    Car buildCar();
}
