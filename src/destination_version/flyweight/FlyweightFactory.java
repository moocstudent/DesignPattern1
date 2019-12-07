package destination_version.flyweight;

import java.util.HashMap;
import java.util.Map;

//工厂类
public class FlyweightFactory {

    //静态集合
    private static Map flyweights = new HashMap();

    //构造器
    public FlyweightFactory(String arg){
        flyweights.put(arg,new FlyweightImpl());
    }

    //静态方法
    public static Flyweight getFlyweight(String key){
        if(flyweights.get(key)==null){
            flyweights.put(key,new FlyweightImpl());
        }
        return (Flyweight) flyweights.get(key);
    }

    public static int getSize(){
        return flyweights.size();
    }
}
