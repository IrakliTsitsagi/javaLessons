public class javasawyisi {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 3;
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else if (z > y && z > x) {
            System.out.println(z);
        }
    }
}