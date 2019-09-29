package destination_version.prototype;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class Test {

	public static void main(String[] args) {
		Prototype obj = new Prototype();
		
		try {
		Prototype obj2 = (Prototype) obj.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
