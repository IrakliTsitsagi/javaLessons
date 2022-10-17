public class XmovnebiDaTanxmovnebi {
    public static void main(String[] args) {
        String a = "jandaba";
        String b = "";
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a'
                    || a.charAt(i) == 'e'
                    || a.charAt(i) == 'i'
                    || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                b =b+a.charAt(i);

            } else {
                c =c+a.charAt(i);
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}
