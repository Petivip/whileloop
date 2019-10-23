import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0,i=0;//guess is initialized to 0

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while ( guess != secretNumber)
        {
            i+=1;

            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
          if(i==5){

              break;
          }
        }
        if(i==5){
            System.out.println("You have guessed more than five times. Bye Bye!");
        } else {
        System.out.println("You are correct. You win a prize!");}
        keyboard.close();
    }
}