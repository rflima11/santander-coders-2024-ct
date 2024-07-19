import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String numeroString = scan.nextLine();

        int numero = Integer.parseInt(numeroString);

        System.out.println(numero + 3);

        scan.close();

    }
}
