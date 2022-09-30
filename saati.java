public class saati {
    public static void main(String[] args) {
        int wamebi = 3665;
        int wamiSaatshi = 3600;
        int wutiSaatshi = 60;
        int saati= 3665 / wamiSaatshi;
        int wuti = 65 / wutiSaatshi;

        int wami = 65 % 60;
        System.out.println(saati + ":" +  wuti + ":" + wami);
    }
}
