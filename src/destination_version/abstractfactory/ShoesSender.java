package destination_version.abstractfactory;

public class ShoesSender implements Sender{
    @Override
    public void send(){
        System.out.println("This is a sender of ShoesSender~");
    }
}
