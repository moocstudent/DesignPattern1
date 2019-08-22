package factory;

/**
 * 学生类实现工作接口,让学生工作,doWork为学生做作业~
 */
public class StudentWork implements Work{

    @Override
    public void doWork() {
        System.out.println("学生做作业.");
    }
}
