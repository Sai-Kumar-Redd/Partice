package collections;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("T Sai Kumar");
        ll.add("E.N Rohith");
        ll.add("Venkatesh");
        ll.add(0,"Venkat");
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.set(1,"sai");
        System.out.println(ll);
        ll.addFirst("Niharka");
        System.out.println(ll);



    }
}
/*
Method of Linked LIst
1.Void addFirst(Object o);
2.Void addLast(Object o);
3.Object getFirst();
4.Object Last();
5.Object Remove First
6.Object Remove Last
 */
/*
1.The UnderLying DataStructure is Double Linked LIst
2.Duplicate are allowed
3.Insertion order is Peserved.
4.Hetergenous Objets are Allowed.
5.Null Insertion is Allowed;
6.Implements Seriazable and Cloneable interfaces but not Random Access
7.Insertion /Deletion in the middle  then Linked LIst is the best Choice.

 */