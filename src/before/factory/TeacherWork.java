package before.factory;

/**
 * 老师类实现工作接口,老师的作业是审批学生做的作业.
 */
public class TeacherWork implements Work{
    @Override
    public void doWork() {
        System.out.println("老师审批作业.");
    }
}
