package destination_version.bridge;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 * 
 */
public class BridgeTest {
	
	public static void main(String[] args) {
		
		Bridge bridge = new MyBridge();
		
		/*���õ�һ������*/
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();
		
		/*���õڶ�������*/
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
