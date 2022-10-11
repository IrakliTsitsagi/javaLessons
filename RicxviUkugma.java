public class RicxviUkugma {
    public static void main(String[] args) {
        int ricxvi = 123;
        int shebrunebuli = 0;
        System.out.println(ricxvi);
        while (ricxvi != 0) {
            int nashti = ricxvi % 10;
            shebrunebuli = shebrunebuli * 10 + nashti;
            ricxvi /= 10;
        }
        System.out.println(shebrunebuli);
    }
}