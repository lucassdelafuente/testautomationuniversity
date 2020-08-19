package finalProject;

/*
 * This one will have fields called name and guess.
 * You'll also have encapsulation in Player, and then add a constructor which accepts a player's name.
 */

public class Player {

    private String name;
    private String guess;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

}
