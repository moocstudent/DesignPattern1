package destination_version.visit;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class Test {

	public static void main(String[] args) {
		
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);	
	}
}
