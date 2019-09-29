package destination_version.state;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class Test {

	public static void main(String[] args) {
		
		State state = new State();
		Context context = new Context(state);
		
		//���õ�һ��״̬
		state.setValue("state1");
		context.method();
		
		//���õڶ���״̬
		state.setValue("state2");
		context.method();
	}
}
