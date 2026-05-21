package lambdamethodsDemo;

import java.util.Map;
import java.util.HashMap;
public class Demo {
    public static void main(String [] s){
        Map<Integer , String> usr1=new HashMap<>();
        Map<Integer,String > usr2=usr1;
        usr1.put(1,"Ram");

        System.out.println(usr1);
    }
}

