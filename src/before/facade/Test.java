package before.facade;

public class Test {

    public static void main(String[] args) {
        ServiceA sa = new ServiceAImpl();
        ServiceB sb = new ServiceBImpl();

        sa.methodA();
        sb.methodB();

        System.out.println("=========");
        //before.facade
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
