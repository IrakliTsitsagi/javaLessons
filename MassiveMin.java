public class MassiveMin {
    public static void main(String[] args) {
        int masivi[] = {1, 2, 5, 6, 7, 77, 54, 69, 32};
        int i;
        int min = masivi[0];
        for (i = 0; i < masivi.length; i++) {
            if (masivi[i] < min)
                min = masivi[i];
        }
        System.out.println(min);
    }
}
