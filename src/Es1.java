import java.util.Arrays;

public class Es1 {

    static int multi (int num1, int num2) {
        return num1 * num2;
    }

    static String concat (String stringa, int num3) {
                return stringa + num3 ;
    }

    static String[] push (String[] arr, String stringa) {
        String[] arrplus = {arr[0], arr[1],stringa, arr[2], arr[3],arr[4]};
       return arrplus;}



    public static void main(String[] args) {

        int risultato = multi(10, 2);
        System.out.println(risultato);

        String frase = concat("numero: ", 5);
        System.out.println(frase);

        String[] vecchioarr = {"uno", "due", "tre", "quattro", "cinque"};
        String[] nuovoarr =  push(vecchioarr, "nuovoTre");
        System.out.println(Arrays.toString(nuovoarr));

    }

}


