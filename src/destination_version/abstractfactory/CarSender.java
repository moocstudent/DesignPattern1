package destination_version.abstractfactory;

public class CarSender implements Sender{
    @Override
    public void send() {
        System.out.println("已下流水线,汽车已发送...");
    }
}
