package destination_version.adpter;

public interface Power {

    public void who();
    public boolean isPowerOn(double electricFee);    //strip  electric
    public boolean isPowerOn();
    public double voltage();  //电压
    public void setPowerType(String powerType);
    public String getPowerType();
}
