package destination_version.bridge;

public class MyBridge extends Bridge {
	public void method(){
		getSource().method();
	}
}
