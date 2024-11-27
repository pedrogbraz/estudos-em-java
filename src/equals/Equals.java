package equals;

public class Equals {
    public static void main(String[] args) {
        // Equals vs ==

        // ==
        Integer age1 = 17;
        Integer age2 = 17;
        System.out.println(age1 == age2);


        // Equals
        Integer age3 = 128;
        Integer age4 = Integer.parseInt("128"); // A partir de 127, é necessário usar o equals

        System.out.println(age3.equals(age4));

        // Comparando strings
        String name1 = "Pedro";
        String name2 = "Pedro";

        System.out.println(name1 == name2); // true

        // Equals
        String name3 = "Pedro";
        String name4 = new String("pedro");

        System.out.println(name3.equals(name4)); // Pois agora eu estou comparando um objeto com outro objeto (Ira retornar false pois um comeca maiusculo e outro não)
        System.out.println(name3.equalsIgnoreCase(name4)); // Agora retornara true pois estou comparando um objeto com outro objeto e ignorando a diferenca de maiuscula e minuscula
    }
}
