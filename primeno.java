public class primeno {
    public static boolean primenum(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primenum(7));

    }

}
