import java.util.Scanner;

abstract class Player {
    String name;
    int guesses;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
    abstract static int makeGuess();
