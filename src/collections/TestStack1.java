package collections;

import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

public class TestStack1 {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<Integer>();
         st.add(34);
         st.add(78);
         st.add(67);
         st.add(89);
         st.add(90);

         st.forEach(n->
         {
             System.out.println(n);
         });

         Iterator iterator =st.iterator();
         while (iterator.hasNext()){

             Object result4 =iterator.next();
             System.out.println(result4);


         }

         boolean result=st.empty();
         System.out.println(result);
         int result1=st.size();
         System.out.println(result1);

         System.out.println(st);
         st.pop();
         System.out.println(st);

    }
}
