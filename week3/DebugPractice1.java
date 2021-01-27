
import java.util.Random;
import java.util.Scanner;
public class DebugPractice1 {
    /*
    This application matches your lottery numbers with that of the winning numbers.

    This are some examples of a successful run:

    Please enter 5 numbers of your choice between 0 and 9: 1 2 3 4 5
    These are the winning numbers:
    9, 2, 1, 5, 3,
    These are your numbers:
    1, 2, 3, 4, 5,
    Yay you had matching Numbers: 2,)

    or 

    (Please enter 5 numbers of your choice between 0 and 9: 1 2 3 4 5
    These are the winning numbers:
    2, 5, 0, 5, 2,
    These are your numbers:
    1, 2, 3, 4, 5,
    Sorry you're still poor
    * */

    // main method was missing the public modifier
    public static void main(String[] args) {
        int lottery[] = new int[5];
        int user[] = new int[5];
        int match[] = new int[5];
        boolean won = false;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5;i++) {
            lottery[i] = (int)(Math.random() * 10);
            // syntax error missing ;
        }
        System.out.print("Please enter 5 numbers of your choice between 0 and 9: ");
        user[0] = input.nextInt();
        user[1] = input.nextInt();
        user[2] = input.nextInt();
        user[3] = input.nextInt();
        user[4] = input.nextInt();
        System.out.println("These are the winning numbers: ");
        for (int i = 0; i < 5; i++){
            // i wasn't incremented
            System.out.print(lottery[i] + ", ");
        }
        System.out.println("\nThese are your numbers: ");
        for (int i = 0; i < 5; i++){
            System.out.print(user[i] + ", ");
        }
        for (int i = 0; i < 5;i++){
            if (lottery[i] == user[i]){
                match[i] = lottery[i];
                won = true; // renamed flag to won for readability
            }
        }
        if (won == false){ // changed true to false due to logic error
            System.out.print("\nNo match, Sorry you're still poor");
            // System should have capital S
        }
        else {
            System.out.print("\nYay you had matching Numbers: ");
            for (int i = 0; i <5; i++){
                if (match[i] != 0)
                    System.out.print(match[i] + ", ");
            }
        }
    }
}
