import java.sql.SQLOutput;

public class StringNewLine {
    public static void main(String[] args) {
        String txt = "hidroeleqtrosadguri";
        // varianti 1
        char[] arr = txt.toCharArray();
        for (int i = 0; i < txt.length(); i++){
            System.out.println(arr[i]);
        }
        }
    }
// varianti 2
        /*for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }
    }
} */
