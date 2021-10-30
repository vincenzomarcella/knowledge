import java.util.Scanner;
public class SestoEsercizio{ 
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		int x = input.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		int y = input.nextInt();
		System.out.print("Inserisci il terzo numero: ");
		int h = input.nextInt();

		System.out.println("Base1 = " + x + " Base2 = " + y + " Altezza: " + h);
		System.out.println("Area: " + ((x+y)*h)/2);
	}
}