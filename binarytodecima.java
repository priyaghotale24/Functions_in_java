public class binarytodecima {
    public static void bintodec(int binnum) {
        int mynum = binnum;
        int pow = 0;
        int dec = 0;
        while (binnum > 0) {
            int lastdigit = binnum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;

        }
        System.out.println("Decimal form of  " + mynum + " is " + dec);
    }

    public static void main(String[] args) {
        bintodec(1001);
    }

}
