import java.util.Random;

public class GuessTheNumberGame {

    public static void main (String[] args) {
        //Atributo que se llama target_number con tipo de dato int(entero)
        int target_number = genereRandomNumber();
        System.out.println(target_number);
        //crear el objeto player basado en la clase humanplayer
        HumanPlayer player1 = new HumanPlayer();
        //System.out.println(player1.getNumber());
        int differenceNumber = rangeDifference(target_number, player1.getNumber());

    }

    public static int genereRandomNumber() {
        // funcion que retorna un numero aleatoreo entero
        Random random_number = new Random();
        int final_random_number = random_number.nextInt(100)+1;
        return final_random_number;
    }

    public static int rangeDifference(int targetNumber, int playerNumber) {
        int difference = Math.abs(targetNumber - playerNumber);

        if (difference <= 5) {
            System.out.println("to close.");
        } else if (difference <= 10) {
            System.out.println("Close.");
        } else {
            System.out.println("Far away.");
        }
        return difference;
    }

}