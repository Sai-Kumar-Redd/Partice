public class Test2 {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not Eglible for vote");
        } else {
            System.out.println("Person is Eglible");
        }
    }
        public static void main(String [] args){
        validate(45);
        System.out.println("Rest of Code");
    }

}