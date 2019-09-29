package before.factory.factory_one;

//工厂模式测试 使用createFactory produce方法
public class TestNew {

    public static void main(String[] args) {
        CreateFactory createFactory = new CreateFactory();
        createFactory.produce("student").doWork();
        createFactory.produce("teacher").doWork();
        createFactory.produce("police").doWork();
        createFactory.produce("nothing").doWork();
    }
}
