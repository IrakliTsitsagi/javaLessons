public class SityvaUkugma {
    public static void main(String[] args) {
        String txt = "hidroeleqtrosadguri";
        String shetrialebuli = "";
        for (int i = txt.length()-1; i >= 0; i--){
            shetrialebuli = shetrialebuli + txt.charAt(i);

        }
        System.out.println(shetrialebuli);
    }
}
