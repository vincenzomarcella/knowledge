import java.util.Scanner;
import java.lang.Math;
public class PrimoEsercizio{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int n = Math.abs(input.nextInt());
		int a = 2;
		for(int i = 0; i < n; i++) {
			a=3*a-2;
		}
		System.out.println("Il risultato è: " + a);
	}
}