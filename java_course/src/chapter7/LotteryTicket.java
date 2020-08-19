package chapter7;

import java.util.Random;
import java.util.Arrays;

/*
 * ARRAYS AND BINARY SEARCH
 * What are arrays?
 * Arrays are special objects or containers which can hold multiple values.
 *
 * Sequential Search
 * The first approach is to use a sequential search algorithm. The sequential search algorithm searches every element in the array
 * until it finds the value that it's looking for. Or, until it arrives at the end of the array.
 * This algorithm is okay for small arrays but it's inefficient for arrays with more than several thousand elements.
 *
 * Binary Search
 * Another search algorithm is the binary search. For the binary search the array must first be sorted.
 * So, in the case of our lottery ticket array, the elements would need to be in ascending order from least to greatest.
 * Then you will write code that will begin the search, by checking the element in the middle of the array, to see if it's equal, greater than,
 * or less than the value that you're searching for.
 */

public class LotteryTicket {

    //This is a different type of variable. I'm indicating that this is going to be a constant.
    // A constant is a field within your class whose value does not change.
    private static final int LENGHT = 6;
    public static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]){

        int[] ticket = generateNumbers();
        //Ascending order
        Arrays.sort(ticket);

        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGHT];
        Random random = new Random();

        for(int i=0; i<LENGHT; i++){
            int randomNumber;
            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
            */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));

            ticket[i] = randomNumber;

            //it could has a duplicate numbers ->ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;

    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search trough
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */

    public static boolean search(int[] array, int numberToSearchFor){

        /*This is called an enhanced loop.
          It iterates through 'array' and
          each time assigns the current element to 'value'
         */
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }

        /*
        If we have reached this point, then the entire array was searched
        and the value was not found.
         */
        return false;

    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGHT; i++){
           System.out.print(ticket[i] + " | ");
        }

    }
}
