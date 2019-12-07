package destination_version.adpter;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 * 
 */
public class AdapterTest {

	public static void main(String[] args) {
		//源声明为对象
		Source source = new Source();
		//把源对象装入包装类
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
