package destination_version.decorator;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
