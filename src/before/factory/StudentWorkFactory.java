package before.factory;

/**
 * 学生的工作工厂模式 getWork返回类型Work,获取学生工作实例.再调取方法即获取学生工作
 */
public class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
