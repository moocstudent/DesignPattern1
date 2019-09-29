package destination_version.memento;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class Test {

	public static void main(String[] args) {
		
		// ����ԭʼ��
		Original origi = new Original("egg");

		// ��������¼
		Storage storage = new Storage(origi.createMemento());

		// �޸�ԭʼ���״̬
		System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());
		origi.setValue("niu");
		System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());

		// �ظ�ԭʼ���״̬
		origi.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ��" + origi.getValue());
	}
}
