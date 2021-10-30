import java.util.Scanner;

public class SecondoEsercizio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Inserisci una stringa con sole lettere minuscole: ");
        String string1 = input.nextLine();
        for(int i = 0; i < string1.length(); i++){
            //System.out.printf("Char at index %d is %s\n", i, string1.charAt(i));
            if(string1.charAt(i) < 'a' || string1.charAt(i) > 'z') {
                throw new Error("La stringa deve essere minuscola!!!!!");
            }
        }
        System.out.printf("Inserisci un'altra stringa con sole lettere maiuscole: ");
        String string2 = input.nextLine();
        for(int i = 0; i < string2.length(); i++){
            //System.out.printf("Char at index %d is %s\n", i, string2.charAt(i));
            if(string2.charAt(i) < 'A' || string2.charAt(i) > 'Z') {
                throw new Error("La stringa deve essere maiuscola!!!!!");
            }
        }
        for(int i = 0; i < string1.length(); i++) {
            for(int j = 0; j < string2.length(); j++) {
                System.out.printf("%s%s\n", string1.charAt(i), string2.charAt(j));
            }
        }
    }
}
