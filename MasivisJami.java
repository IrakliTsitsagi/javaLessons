public class MasivisJami {
    public static void main(String[] args) {
        int masivi[] = {1, 2, 5, 6,};
        int jami = 0;
        int i;
        for (i = 0; i < masivi.length; i++)
            jami += masivi[i];
        System.out.println(jami);
        
        // max number vipovot
         int max=masivi[0];
        for (i = 0; i < masivi.length; i++)
            if (masivi[i] > max)
                max = masivi[i];
        System.out.println(max);
    }
}
