import java.util.Scanner;

public class prodfun {

    public static int product(int n1, int n2) {
        int prod = n1 * n2;
        return prod;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int multi = product(a, b);
        System.out.println("product is=" + multi);
    }

}
