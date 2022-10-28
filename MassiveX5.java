public class MassiveX5 {
    public static void main(String[] args) {
        int masivi[] = {1, 2, 5, 6, 7, 77, 54, 69, 32};
        int i;
        int x5;
        for (i = 0; i < masivi.length; i++) {
            x5 = masivi[i] * 5;
            System.out.println(masivi[i] + " "+ x5);
        }
    }
}