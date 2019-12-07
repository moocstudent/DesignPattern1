package destination_version.abstractfactory;

//当作一个装置
public class SendShoesFactory implements Provider{
    @Override
    public Sender produce() {
        return new ShoesSender();
    }
}
