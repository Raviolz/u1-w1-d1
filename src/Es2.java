import java.util.Scanner;

public class Es2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao Utente, forniscimi la prima parola");

        String first = scanner.nextLine();

        System.out.println("Ora la seconda parola");

        String second = scanner.nextLine();

        System.out.println("Infine la terza parola");

        String third = scanner.nextLine();


        System.out.println(first + " " + second + " " + third);
        System.out.println("ora al contrario :" + third + " " + second + " " + first );
    }
}