

class Add{                    //Method overloding Program: 1.The method must have the same name as in the parent class
                                            //2.The method must have the same parameter as in the parent class.
                                            //3.There must be an IS-A relationship (inheritance).
    int add(int a, int b) {
        return (a+b);

    }
    int add(int a, int b, int c){
        return (a+b+c);

    }
    int  sub(int a, int b, int c){
        return (a-b-c);
    }

}
public class MethodOverloding {
    public static void main(String[]args){
        Add a=new Add();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10,20,30));
        System.out.println(a.sub(10,20,30));

    }
}
