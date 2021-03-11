public class Main {
    public static void main(String[] args) {

        boolean from1000 = true;
        int TopUpFrom1000;

        if (from1000){
            TopUpFrom1000 = 1;
        } else {
            TopUpFrom1000 = 0;
        }

        TopUpFrom1000 = 4000;
        int each100 = 100;
        int bill = 100;

        int bonusEND = TopUpFrom1000 / each100;
        System.out.println(bonusEND);
    }
}
