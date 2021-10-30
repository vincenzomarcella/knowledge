import java.util.Scanner;

public class ScannerExercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.next();
        System.out.println("Ciao " + nome);
        String nomeCambiato = nome.replace(nome.charAt(0), 'Z');
        System.out.println("Ho cambiato il tuo nome da " + nome + " a " + nomeCambiato);
        System.out.print("Inserisci un secondo nome: ");
        String secondoNome = input.next();
        System.out.println("I nomi che hai inserito messi insieme fanno: " + nome + " " + secondoNome);
        System.out.print("Ora inserisci un numero: ");
        int numero = input.nextInt();
        System.out.println("Il tuo numero è: " + numero);
        double millesimi = numero * 0.001;
        System.out.println("Ho convertito il tuo numero in millesimi e mi viene: " + millesimi);
        input.close();
    }
}
