package before.factory.factory_one;

//原工厂测试,新工厂测试使用了CreateFactory,传参生成对应实体类
public class Test {

    public static void main(String[] args){
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();

        PoliceWorkFactory policeWorkFactory = new PoliceWorkFactory();
        policeWorkFactory.getWork().doWork();
    }
}
