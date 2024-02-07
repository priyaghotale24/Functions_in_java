import java.util.Scanner;

public class divfun {

    public static int division(int n1, int n2) {
        int div = n1 / n2;
        return div;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int divide = division(a, b);

        System.out.println("division is =" + divide);

    }

}
