package before.composite;

public class ProjectAssistant extends Employer{

    public ProjectAssistant(String name){
        setName(name);
        employers = null; //项目助理
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
