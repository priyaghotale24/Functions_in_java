import java.util.*;

public class function2 {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int add = sum(a, b);
        System.out.println("sum=" + add);
    }
}
