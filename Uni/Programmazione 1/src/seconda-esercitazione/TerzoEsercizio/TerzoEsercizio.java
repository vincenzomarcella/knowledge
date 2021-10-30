import java.util.Scanner;

public class TerzoEsercizio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Inserisci una stringa di caratteri minuscoli: ");
        String str = input.nextLine();
        for(int i = 0; i < str.length(); i++){
            //System.out.printf("Char at index %d is %s\n", i, string1.charAt(i));
            if(str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                throw new Error("La stringa deve essere minuscola!!!!!");
            }
        }
        System.out.printf("Inserisci un numero intero compreso tra 0 e la lunghezza della stringa: ");
        int m = input.nextInt();
        if(m < 0 || m > str.length()){
            throw new Error("Il numero deve essere tra 0 e la lunghezza della stringa");
        }
        System.out.printf("Inseriscine un altro: ");
        int n = input.nextInt();
        if(n < 0 || n > str.length()){
            throw new Error("Il numero deve essere tra 0 e la lunghezza della stringa");
        }
        int[] visitedPositions = new int[str.length()];
        int usedPositions = 0;
        int position = m;
        boolean positionVisited = false;
        String finalString = new String();
        int counter = 1;
        do {
            if (counter == 1) {
                position = m;
            } else {
                position = (m + (counter * n)) % str.length();
            }
            for(int i = 0; i < usedPositions; i++) {
                if(position == visitedPositions[i]) {
                    positionVisited = true;
                    break;
                }
            }
            visitedPositions[usedPositions] = position;
            usedPositions++;
            finalString = finalString.concat(String.valueOf(str.charAt(position)));
            counter++;
        } while (positionVisited == false);
        System.out.printf("La nuova stringa è: %s\n", finalString);
        input.close();
    }
}
