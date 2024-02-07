import java.util.Scanner;

public class factorialfun {

    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:");
        int n = s.nextInt();
        factorial(n);
    }
}
