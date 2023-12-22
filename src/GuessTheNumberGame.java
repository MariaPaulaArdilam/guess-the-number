import java.util.Random;

public class GuessTheNumberGame {

    public static void main (String[] args) {
        //Atributo
        int targetNumber = genereRandomNumber();
        System.out.println(targetNumber);
        //objeto
        HumanPlayer player = new HumanPlayer();
        player.captureName();
        ComputerPlayer compuPlayer = new ComputerPlayer();
        checkGuess(player, compuPlayer, targetNumber);

    }

    public static int genereRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(100)+1;
    }


    public static boolean rangeDifference(int targetNumber, int makeGuess, HumanPlayer player, ComputerPlayer compu) {
        boolean guessed;
        int difference = Math.abs(targetNumber - makeGuess);

        if (targetNumber == makeGuess) {
            if (player != null) {
                System.out.println("Congratulations, " + player.getName() + " You guessed the number.");
                System.out.println("Attempts: " + player.getGuesses());
                System.out.println("Total attempts: " + player.getGuesses().size());
            } else if (compu != null) {
                System.out.println("Congratulations, " + compu.getName() + " You guessed the number.");
                System.out.println("Attempts: " + compu.getGuesses());
                System.out.println("Total attempts: " + compu.getGuesses().size());
            }
            guessed = true;
        }
        else if (difference <= 5) {
            System.out.println("to close.");
            guessed = false;
        } else if (difference <= 10) {
            System.out.println("Close.");
            guessed = false;
        } else {
            System.out.println("Far away.");
            guessed = false;
        }

        return guessed;
    }

    public static void checkGuess(HumanPlayer player, ComputerPlayer compuPlayer, int target_number) {
        while (true) {
            int humanPlayerNumber = player.makeGuess(player);
            boolean answerDifferenceHuman = rangeDifference(humanPlayerNumber, target_number, player, null);
            if (answerDifferenceHuman) {
                break;
            } else {
                int compuPlayerNumber = compuPlayer.makeGuess(compuPlayer);
                boolean answerDifferenceCompu = rangeDifference(compuPlayerNumber, target_number,null, compuPlayer);
                if (answerDifferenceCompu) {
                    break;
                }
            }
        }
    }
}
