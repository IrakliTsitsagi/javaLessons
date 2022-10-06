public class Jami {
    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        int num = 124;
        System.out.println(getSum(num));

    }
}
