public class StringTest {
    public static void main(String args[]){
        String parola = "pippo";
        String nome = "Vincenzo";
        
        String sottostringa = nome.substring(2, 4);
        System.out.println(sottostringa);

        sottostringa = nome.substring(3);
        System.out.println(sottostringa);

        parola = parola.toUpperCase();
        System.out.println(parola);

        parola = parola.toLowerCase();
        System.out.println(parola);

        nome = "PIPPO";
        parola = "pippo";

        System.out.println(parola.equals(nome));
        System.out.println(parola.equalsIgnoreCase(nome));

        System.out.println(nome.charAt(2));

        int n = nome.indexOf("PP");
        System.out.println(n);

        n = nome.indexOf("pp");
        System.out.println(n);
    }
}
