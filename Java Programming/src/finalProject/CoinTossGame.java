package finalProject;

/*FINAL PROJECT
 * You're going to create an object-oriented coin toss game — this project will consist of three classes.
 * The first class is Coin.
 *   It should contain a field called side, encapsulation, constant variables for heads and tails,
 *   a method called flip(), which randomly chooses heads or tails and assigns that value to side.
 * Your second class will be one called Player.
 *   This one will have fields called name and guess.
 *   You'll also have encapsulation in Player, and then add a constructor which accepts a player's name.
 * Finally, the third class will be one called CoinTossGame — which creates two players.
 *   It asks player 1 to choose heads or tails, and ensures that player 1’s guess is valid.
 *   Don't move on until player 1 actually has a valid guess.
 *   Then, automatically assign player 2’s guess to the opposite of what player 1 chose.
 *   You're going to flip the coin in this class to determine which side it landed on. Then you're going to determine a winner based on what the coin landed on.
 * Also, be sure to use methods appropriately in this class.

 */

import java.util.Scanner;

public class CoinTossGame {

    private static Scanner scanner = new Scanner(System.in);
    private static Coin coin = new Coin();
    private static String namePlayer1;
    private static String namePlayer2;

    public static void main(String args[]){

        System.out.println("Welcome to the game!");

        String optionPlayer1 = getPlayers();

        System.out.println("Flip the ");
        String results = coin.flip();

        getWinner(results,  optionPlayer1);

        scanner.close();
    }

    public static String getPlayers(){

        System.out.println("Player 1: What is your name?");
        namePlayer1 = scanner.next();

        Player player1 = new Player(namePlayer1);

        System.out.println(player1.getName() + ": Do you choose heads or tails?");
        String optionPlayer1 = scanner.next();

        System.out.println("Player 2: What is your name?");
        namePlayer2 = scanner.next();

        Player player2 = new Player(namePlayer2);

        return optionPlayer1;

    }

    public static void getWinner(String result, String optionPlayer1){

        if(result.equals(optionPlayer1)){
            System.out.println(namePlayer1 + " is the winner.");
        }
        else{
            System.out.println(namePlayer2 + " is the winner.");
        }
    }
}
