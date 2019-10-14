

package javaguessinggame;



import java.util.Random;
import java.util.Scanner;


public class JavaGuessingGame {

    public static void main(String[] args) {
         

        
        int answer, guess; //created answer and guess variables
        final int MAX = 10;
        
        
        Scanner sc = new Scanner(System.in); //scanner input created
        Random rand = new Random(); //random class is implemented
        
        
        
        answer = rand.nextInt(MAX) + 1;
        
        do{
        
        
        System.out.println("Guess a number between 1 annd 10: ");
        guess = sc.nextInt();
        
        if(guess < answer) //if the user guess is lower than the answer, the program will have the user try again
        {
           System.out.println("Sorry Please try again, that guess was too low! ");
        }
        else if(guess > answer) //if the user guess is higher than the answer, the program will have the user try again
        {
           System.out.println("Sorry Please try again, that guess was too high! ");
        }
         
        else //if the user guess is correct, program will build successfully
        {
          System.out.println(" Good Job! the number was " + answer);
        }
    } while(guess!= answer);
    }
    
}
