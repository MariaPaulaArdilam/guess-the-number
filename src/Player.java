import java.util.ArrayList;

abstract class Player {
    String name;
    ArrayList<Integer> guesses;

    public Player() {
        this.guesses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses(int number) {
        this.guesses.add(number);
    }

    abstract int makeGuess(Player player);
}
