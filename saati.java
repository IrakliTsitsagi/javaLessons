public class Main {
    public static void main(String[] args) {
        int wamebi = 3665;
        int wamiSaatshi = 3600;
        int wutiSaatshi = 60;
        int saati= wamebi / wamiSaatshi;
        int wutebi = wamebi % wamiSaatshi;
        int wuti = wutebi / wutiSaatshi;

        int wami = wutebi % 60;
        System.out.println(saati + ":" +  wuti + ":" + wami);
    }
}
