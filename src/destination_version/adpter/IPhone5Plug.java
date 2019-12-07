package destination_version.adpter;

public class IPhone5Plug implements Plug{
    @Override
    public void who(){
        System.out.println("I am the IPhone5's plug.");
    }

    @Override
    public int useForPlugsSize() {
        return 2;
    }

}
