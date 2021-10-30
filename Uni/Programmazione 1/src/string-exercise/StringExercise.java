public class StringExercise {
    public static void main(String args[]){
        String nome = "vincenzo", nomeCopia = "vincenzo";
        System.out.println("Stringa iniziale: " + nome);
        System.out.println("Comparazione con stringa iniziale: " + nome.equals(nomeCopia));
        nome = "V"+"incenzo";
        System.out.println("Stringa finale: "+ nome);
        System.out.println("Comparazione con stringa finale: " + nome.equals(nomeCopia));
    }
}
