package collections;

import java.util.ArrayList;                    //Array LIst Important Points:

public class TestArrayList {               //1.The UnderLying data Structure is Resizeable array or Growable Array.

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();      //2.Duplicates are allowed.
                                                  //3.Insertion order is Peserved.
                                                     //4.Null Insertion is POssible.
        al.add("T Sai Kumar Reddy");                   //5.Heterogenous objects are  allowed.(except Treeset ,Treemap)
        al.add("T Pavani");                             //6.It is non Legancy
        al.add("");
          al.add(0,"Reddy");                                                  //7.No method is Synchronized
        System.out.println(al);                                                //8.Retrive Performance is high Beause  threads are not
                                                            //require to wait.
    }
}
/*
LIst Interface  Spectifice Methods
1.add
2.addAll
3.get(int index)
4.remove(int index)
5.List Iterator list literator

 */
