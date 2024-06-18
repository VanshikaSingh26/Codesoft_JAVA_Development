import java.util.Random;
import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total_score = 0;
        int number_of_rounds_played = 0;
        boolean play_again = true;

        while(play_again){
            int number_to_be_guessed = random.nextInt(100) + 1;
            int attempts = 0;
            int maximum_attempts = 10;
            boolean guessed_correctly = false;

            System.out.println("Guess a number between 1 and 100. You have " + maximum_attempts + " attempts.");

            while(attempts < maximum_attempts) { 
                System.out.println("Enter your guess for the number  :");
                int user_guess = scanner.nextInt();
                attempts++;
                if (user_guess == number_to_be_guessed){
                    System.out.println("Ohh WOW, it's the correct answer !!");
                    total_score = total_score + maximum_attempts - attempts + 1;
                    guessed_correctly = true;
                    break;
                }

                else if(user_guess < number_to_be_guessed){
                    System.out.println("Your guessed number is smaller than the generated number : Try Again");
                }

                else{
                    System.out.println("Your guessed number is larger than the generated number : Try Again");
                }
            }

            if(!guessed_correctly){
                System.out.println("Sorry but you have used all your chances..");
            }

            number_of_rounds_played ++ ;
            System.out.println("Will you like to play again??(yes / no) :");
            scanner.nextLine();
            String response = scanner.nextLine();
            play_again = response.equalsIgnoreCase("yes");

        }

        System.out.println("Game Over.. You played " + number_of_rounds_played + "rounds.");
        System.out.println("Your total score is : " + total_score);
        scanner.close();;
    }
}