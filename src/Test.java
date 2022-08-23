public class Test {
    public static void main(String[] args) {
        try{
            int a=0;
            System.out.println("a"+a);
             int b=30 /a;
             System.out.println("b"+b);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by the Zero");

        }
        finally {
            System.out.println("T Sai Kumar Reddy");
        }


    }
}
