package destination_version.adpter;

public class PowerTest {
    public static void main(String[] args) {
        //i5插头
        Plug iPhone5Plug = new IPhone5Plug();
        new BullStrip();
        BullStrip bullStrip = new BullStrip(iPhone5Plug);
        int i = bullStrip.turnOn();
        if(i>0){
            System.out.println("插排已插电.");
        }

    }
}
