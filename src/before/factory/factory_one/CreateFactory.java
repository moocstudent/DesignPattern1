package before.factory.factory_one;

public class CreateFactory {
    public Work produce(String workTitle) {
        Work work = null;
        switch (workTitle) {
            case "student" -> work = new StudentWork();
            case "teacher" -> work = new TeacherWork();
            case "police" -> work = new PoliceWork();
            default -> work = new Work() {
                @Override
                public void doWork() {
                    System.out.println("""
                                    没有工作,只能跳舞
                                    dance...dance...dddddd...dance ~~~
                                    """);
                }
            };
        }
        return work;
    }
}
