package destination_version.adpter;

//公牛插排
public class BullStrip implements Strip {

    private final String name = "公牛插排";

    private Plug plug;

    private final int twoPlugsSize = 3;  //
    private final int threePlugsSize = 3; //

    private HomePower homePower;

    public BullStrip() {
            homePower = new HomePower();
            homePower.who();
            if (homePower.isPowerOn()) {
                System.out.println("插排已插电!");
            } else {
                System.out.println("未交电费!请交电费后再使用.");
            }

        System.out.println(homePower.getPowerType());
        System.out.println(homePower.voltage());
    }

    public void declar() {
        plug.who();
    }

    public BullStrip(Plug plug) {
        this.plug = plug;
        plug.who();
        System.out.println("已经插入" + name);
    }

    @Override
    public void who() {
        System.out.println("I am the bull brand strip");
    }

    @Override
    public int turnOn() {
        homePower = new HomePower();
        System.out.println("The power strip is turn on!");
        if (homePower.isPowerOn()) {
            return 1;
        }
        return 0;

    }

    @Override
    public int turnOff() {
        System.out.println("The power strip is turn off!");
        return 1;
    }


}
