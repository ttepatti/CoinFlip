import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        System.out.println("We're going to flip a coin. Do you think it will land on heads or tails? (Or \"quit\" to exit)");
        int i = 0;
        while (i < 1) {
            swagger();
        }
    }

    public static void swagger() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Guess: ");
        String guess = in.nextLine();
        if (guess.equals("heads")) {
            System.out.println("Flipping coin...");
            int answer = random.nextInt((2 - 1) + 1) + 1;
            if (answer == 1) {
                System.out.println("You got it right! :)");
            } else {
                System.out.println("Sorry, you were wrong! :(");
            }
        } else if (guess.equals("tails")) {
            System.out.println("Flipping coin...");
            int answer = random.nextInt((2 - 1) + 1) + 1;
            System.out.println(answer);
            if (answer == 2) {
                System.out.println("You got it right! :)");
            } else {
                System.out.println("Sorry, you were wrong! :(");
            }
        } else if (guess.equals("quit")) {
            System.exit(0);
        } else {
            System.out.println("Sorry! You seem to have entered some odd input. Try entering \"heads\" or \"tails\"");
        }
    }
}
