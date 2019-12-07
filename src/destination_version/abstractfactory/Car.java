package destination_version.abstractfactory;

public class Car {
    public void thisIsCar(Sender sender) {
        System.out.println("汽车已组装完毕等待发送.");
        sender.send();
    }
}
