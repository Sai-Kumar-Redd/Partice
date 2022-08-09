import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args) {
        int i,n,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number");
          n = sc.nextInt();
        for (i=1; i<=n; i++) {
            if (n%i==0)
            {
                count++;
            }
        }
        if (count ==2)
            System.out.println("It is a prime Number");
        else
            System.out.println("It is a not prime Number");
    }
}
