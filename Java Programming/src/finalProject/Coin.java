package finalProject;

/*
 * It should contain a field called side, encapsulation, constant variables for heads and tails,
 * a method called flip(), which randomly chooses heads or tails and assigns that value to side.
 */

import java.util.Random;

public class Coin {

    private String side;
    public static String heads = "heads";
    public static String tails = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }


    public String flip(){
        if(new Random().nextBoolean()){
            setSide(heads);
        }
        else{
            setSide(tails);
        }

        return getSide();
    }
}
