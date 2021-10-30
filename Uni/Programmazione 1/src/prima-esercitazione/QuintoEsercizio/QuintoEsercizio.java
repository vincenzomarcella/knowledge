import java.util.Scanner;
public class QuintoEsercizio{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		int x = input.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		int y = input.nextInt();
		System.out.println("Area del rettangolo di lati " + x + " e " + y + ": " + x*y);
	}
}