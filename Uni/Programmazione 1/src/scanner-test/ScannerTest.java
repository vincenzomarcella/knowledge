import java.util.Scanner;

public class ScannerTest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        /*int i1, i2, i3;
        System.out.print("Inserisci tre interi separati da spazi: ");
        i1 = input.nextInt();
        i2 = input.nextInt();
        i3 = input.nextInt();
        System.out.println("Primo intero: " + i1);
        System.out.println("Secondo intero: " + i2);
        System.out.println("Terzo intero: " + i3);*/
        /*System.out.print("Ora inserisci altri due numeri: ");
        double d1, d2;
        d1 = input.nextDouble();
        d2 = input.nextDouble();
        System.out.println("Primo intero: " + d1);
        System.out.println("Secondo intero: " + d2);*/
        /*System.out.print("Ora digita due parole: ");
        String s1, s2;
        s1 = input.next();
        s2 = input.next();
        System.out.println("Prima stringa: " + s1);
        System.out.println("Seconda stringa: " + s2);
        s1 = input.nextLine();

        System.out.print("Inserisci una frase: ");
        s1 = input.nextLine();
        System.out.println("Frase: " + s1);*/
        System.out.print("Inserisci un carattere: ");
        char c;
        c = input.next().charAt(0);
        System.out.println("Carattere inserito: " + c);
        c = (char)(c + 1);
        System.out.println("Il carattere da te inserito è diventato: " + c);
        c++;
        System.out.println("Ora è diventato: " + c);
        int n = c;
        System.out.println("Il suo codice ASCII è: " + n);
        input.close();
    }
}
