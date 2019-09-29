package destination_version.factorymethod;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class FactoryTest {

	public static void main(String[] args) {	
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
