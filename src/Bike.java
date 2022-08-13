public class Bike {
    static void run(){
        System.out.println("Running");
                                               // Final Keyword: A final class is a class
                                               // that can't be extended.
                                               //Also methods could be declared as final to indicate that
                                                //cannot be overridden by subclasses.
    }
    static class Car extends  Bike{
        public static  void main(String[]args){

            new Car().run();
        }
    }
}
