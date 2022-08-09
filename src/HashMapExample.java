import java.util.*;
public class HashMapExample {
    public static void main(String[] args){
        HashMap m=new HashMap();
        m.put(1,"Sai");
        m.put(2,"Kumar");
        m.put(3,"Reddy");
        m.put(4,"Reddy");
        m.put(3,"Sai");// if you key duplicate it will the value Replace the Sai with Reddy
        m.put(5,"Sai");//if you use duplicates values in hash map it will allow
        

        System.out.println(m);

        Set s=m.keySet();//to collect only keys
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);//To Collect only values
        //Iterator it=m.iterator();
       // System.out.println(it.next());
        System.out.println("The value get from 2 nd index=" +m.get(2));//To get Index
        System.out.println("The Value of size hash map="+m.size());//To find the  size of map
        System.out.println("It will say the Condition="+m.containsKey(2));
        System.out.println("It will say the Condition="+m.containsKey(7));
        System.out.println("It will say the Condition="+m.containsValue("Sai"));
        System.out.println("It will say the Condition="+m.containsKey("IAS"));
    }
}
