import java.util.Random;

public class GuessTheNumberGame {
    public static void main (String[] args) {
        //Atributo que se llama target_number con tipo de dato int(entero)
        int target_number = genereRandomNumber();
        System.out.println(target_number);
    }

    public static int genereRandomNumber() {
        // funcion que retorna un numero aleatoreo entero
        Random random_number = new Random();
        int final_random_number = random_number.nextInt(100)+1;
        return final_random_number;
    }

}