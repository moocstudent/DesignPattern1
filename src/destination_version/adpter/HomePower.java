package destination_version.adpter;

//家庭用电
public class HomePower implements Power{

    private double electricFee;        //money 200
    private String powerType = null;    //电源类型

    @Override
    public void who() {
        System.out.println("我是家庭用电!");
    }

    @Override
    public boolean isPowerOn(double electricFee) {
        this.electricFee += electricFee;
        if(this.electricFee>=0){
            return true;
        }
        return false;
}

    @Override
    public boolean isPowerOn() {
        if(this.electricFee>=0){
            return true;
        }
        return false;
    }


    @Override
    public double voltage() {
        return 200;
    }

    @Override
    public void setPowerType(String powerType) {
         this.powerType = powerType;
    }

    @Override
    public String getPowerType() {
         return powerType;
    }
}
