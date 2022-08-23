package collections;

import java.util.Stack;    // peek : It return the top of the object

public class TestStack {  //


    public static void main(String[] args) {
        Stack< String> s=new Stack<String>();
        s.push("T Sai ");
        s.push("Reddy");
        System.out.println(s);
        s.peek();
        System.out.println(s);
        s.pop();        // It Removes The Last Element;

        System.out.println(s);
        s.pop();
        System.out.println(s);

    }

}

