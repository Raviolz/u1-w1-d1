import java.util.Scanner;

public class Es3 {

    static double perimetroRettangolo (double num1, double num2) {
        return 2 * ( num1 + num2);
    }

    static byte pariDispari (int num1) {
        if ( num1 % 2 == 0) return 0 ;
        else return 1 ;

    }

    static double areaTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao Utente,per calcolare il perimetro scrivi il valore del primo lato");

        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ora il secondo il secondo ");

        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println("questa e' il perimetro del rettangolo:" + perimetroRettangolo( n1,n2));

        System.out.println("se stai cercando l area del trinagolo invece scrivi anche il valore del terzo lato");

        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println("questa e' il' area del triangolo:" + areaTriangolo(n1,n2,n3));

        System.out.println("infine dimmi il numero di cui vuoi per scoprire se e' pari o dispari. 1=dispari, 0= pari come risposta");
        int n4 = Integer.parseInt(scanner.nextLine());
        System.out.println(pariDispari(n4));
    }
}

