import java.util.Scanner;

public class subfun {
    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int minus = sub(a, b);
        System.out.println("substraction is=" + minus);

    }
}
