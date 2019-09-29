package destination_version.factorymethod;

public class SendFactory {
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
//	public Sender produceMail(){
//		return new MailSender();
//	}
//	
//	public Sender produceSms(){
//		return new SmsSender();
//	}
//	public Sender produce(String type) {
//		if ("mail" == type) {
//			return new MailSender();
//		} else if ("sms" == type) {
//			return new SmsSender();
//		} else {
//			System.out.println("��������ȷ������!");
//			return null;
//		}
//	}
}
