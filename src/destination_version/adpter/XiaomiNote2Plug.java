package destination_version.adpter;

public class XiaomiNote2Plug implements Plug{
    @Override
    public void who() {
        System.out.println("I am XiaoMiNote2's Plug.");
    }

    @Override
    public int useForPlugsSize() {
        return 2;
    }
}
