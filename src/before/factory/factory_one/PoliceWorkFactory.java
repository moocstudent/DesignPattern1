package before.factory.factory_one;

//警察工作了
public class PoliceWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new PoliceWork();
    }
}
