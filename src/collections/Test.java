package collections;

/*package collections;

public class DoSelect {
    int i;

    public static void main(String[] args) {
        Float F = 1.03f;
        new DoSelect().divide(F);

    }
    void divide(Double D){
        System.out.print(D/i);
    }

}*/
/*public  class MyClass {
    public static void main(String[] args) {
        int even =0,odd=0;
        for(int i=0;i<5;i++){
            if(i%2==0)
            {
                even+=2;
                System.out.println(i+1+"even");

            }
            else {
                odd+=2;
                System.out.println("odd"+i+1);

            }
        }
        System.out.println(Math.max(even,odd));

    }
}*/
/*public  class Test<T> {
    Test(){

    }
    void m1(){

    }
    static  void m2(){


    }

    public static void main(String[] args) {

    }
}*/
public class Data <T>{
    T val;
    Data(T val){

    }

}

class Test{
    public static void main(String[] args) {
        Data data=new Data(""Helllo"");
        data.val=1;
        System.out.println(data.val.getClass().getSimpleName());
    }
}