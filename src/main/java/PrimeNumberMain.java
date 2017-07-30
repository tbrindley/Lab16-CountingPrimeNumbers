import java.util.Scanner;

/**
 * Created by Travis Brindley on 7/27/2017.
 */
public class PrimeNumberMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keepLooping;
        System.out.println("Welcome to the Grand Circus Prime Generator");

        do{
            System.out.println("Which Prime number would you like?");
            System.out.println("Please enter a number between 1 & 100: ");

            int userPrime = scan.nextInt();
            int primeNum = TDDPractice.primeNumber(userPrime);

            System.out.println("Your prime number is: " + primeNum);

            System.out.println("Would you like to play again? (Y/N) ");
            scan.nextLine(); //garbage catcher
            keepLooping = scan.nextLine();

        }while(keepLooping.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing");
    }
}
