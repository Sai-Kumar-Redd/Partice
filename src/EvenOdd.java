import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            int even=0;


            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
