package composite;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");

        pm.add(pa);
        pm.add(programmer2);

        List<Employer> ems = pm.getEmployers();
        for(Employer em : ems){
            System.out.println(em.getName());
        }
    }
}
