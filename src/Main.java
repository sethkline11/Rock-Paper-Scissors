import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int cpuGuess = rand.nextInt(3); // 0 = rock, 1 = paper, 2 = scissors
        System.out.println("Let's Play Rock, Paper, Scissors!");
        System.out.println("Type out 'rock', 'paper', or 'scissors' to play!");
        String playerGuess = scan.next();
        if (playerGuess.equals("rock"))
        {
            if (cpuGuess == 0)
            {
                System.out.println("We both threw rock- It's a draw!");
            }
            else if (cpuGuess == 1)
            {
                System.out.println("You threw rock, I threw paper- I win!");
            }
            else
            {
                System.out.println("You threw rock, I threw scissors- You win!");
            }
        }
        else if (playerGuess.equals("paper"))
        {
            if (cpuGuess == 0)
            {
                System.out.println("You threw paper, I threw rock- You win!");
            }
            else if (cpuGuess == 1)
            {
                System.out.println("We both threw paper- It's a draw!");
            }
            else
            {
                System.out.println("You threw paper, I threw scissors- I win!");
            }
        }
        else if (playerGuess.equals("scissors"))
        {
            if (cpuGuess == 0)
            {
                System.out.println("You threw scissors, I threw rock- I win!");
            }
            else if (cpuGuess == 1)
            {
                System.out.println("You threw scissors, I threw paper- You win!");
            }
            else
            {
                System.out.println("We both threw scissors- It's a draw!");
            }
        }
        else
        {
            System.out.println("Invalid Command.");
        }
    }
}