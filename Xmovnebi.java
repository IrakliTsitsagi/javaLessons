public class Xmovnebi {
    public static void main(String[] args) {
        String txt = "hidroeleqtrosadguri";
        int count = 0;
        for (int i = 0; i < txt.length(); i++){
            if (txt.charAt(i) == 'a'
                    || txt.charAt(i) == 'e'
                    || txt.charAt(i) == 'i'
                    || txt.charAt(i) == 'o'
                    || txt.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}