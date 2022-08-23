import java.util.ArrayList;

public class TestArrayListApplication {

    public static void main(String[] args) {

        ArrayList<Integer>al=new ArrayList<>();

        for(int i=0;i<5;i++)
            al.add(i);
        System.out.println(al);


        al.remove(4);  /// Remove the Elements
        System.out.println(al);

       // System.out.println(al.get()+"  ");


    }

}
