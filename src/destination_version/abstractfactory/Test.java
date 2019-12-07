package destination_version.abstractfactory;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 *
 * @author egg
 */
public class Test {

    public static void main(String[] args) {
        Provider emailProvider = new SendMailFactory();
        Sender sender = emailProvider.produce();
        sender.send();
        Provider smsProvider = new SendSmsFactory();
        smsProvider.produce().send();

        Provider sendShoesProdiver = new SendShoesFactory();
        sendShoesProdiver.produce().send();
        
        
        //
        BuildCarFactory buildCarFactory = new BuildCarFactory();
        Car car718 = buildCarFactory.buildCarOK(
                buildCarFactory.buildBody(),
                buildCarFactory.buildBone(),
                buildCarFactory.buildWheel()
        );

        Sender produce = buildCarFactory.produce();
        car718.thisIsCar(produce);
    }
}
