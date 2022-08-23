import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {
    public static <string> void main(String[] args) {
        LinkedList  l = new LinkedList();
        l.add("T Sai Kumar Reddy");
        l.add("T.Pavani");
        l.add("T.Harshitha");
        l.add("T Niharika");
        l.add("T.Malli");
        //System.out.println(l);

        Iterator<String> itr =l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());


        }

    }

}
