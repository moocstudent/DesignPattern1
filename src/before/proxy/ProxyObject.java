package before.proxy;

public class ProxyObject implements Object {

    Object obj;

    public ProxyObject(){
        System.out.println("这是代理类");
    }
    @Override
    public void action() {

    }
}
