package before.factory;

/**
 * 老师的获取工作的工厂类,只是返回了老师工作类的实例 还需要获取方法获取老师工作的具体方法
 */
public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
