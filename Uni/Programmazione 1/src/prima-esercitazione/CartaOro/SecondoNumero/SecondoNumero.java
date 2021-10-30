import java.util.Scanner;
import java.lang.Math;
public class SecondoNumero{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		double n=0;
		double epsilon = Math.abs(input.nextDouble());
		while (!((1-epsilon)<(n/(n+1))) && ((n/(n+1))<=1)) {
			n++;
		}
		System.out.println("Risultato: " + (n/(n+1)));
		System.out.println("N: "+ n);
	}
}