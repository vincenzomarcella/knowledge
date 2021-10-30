import java.util.Scanner;
public class SettimoEsercizio { 
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero: ");
		double x = input.nextDouble();
		System.out.println("Inserisci il secondo numero: ");
		double y = input.nextDouble();
		
		double[] res = {((13+9+6-7)*2), (((2+3)*5)+((2/3+5)*4)+(3+(7+5/13))), 
		                (((3.4+5/6.3)*4.3+(3.5*(-4)))*6), ((x+y)*(x-y)), 
		                (x*x+y*y), (((x+y)*(x-y))/(2*x+y)*(2*x+y))};
		for(double result:res){
			System.out.println("Risultato: " + result);
		}
	}
}