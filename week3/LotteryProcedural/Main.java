import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testing parameters
        final int MAX_TRIES = 1000;
        final int MONEY_WON_TEST = 200000;

        final int NUM_BALLS = 6;
        final int NUM_RANGE = 100;
        final double PRIZE_MONEY = 1000000;

        // for testing purposes
        int userPicks[] = {1, 5, 10, 15, 20, 30};
        int winningNums[] = {1, 5, 10, 15, 20, 30};

        int[] numsPicked; // defines a ref var
        numsPicked = new int[NUM_BALLS]; // allocates 5 contiguous memory locations for type int

        boolean quickPicks = true;

        int simCount = 0;
        double winnings = 0;
        while(simCount < MAX_TRIES && winnings <= MONEY_WON_TEST) {

            if (quickPicks) {
                for (int i = 0; i < NUM_BALLS; i++) {
                    numsPicked[i] = (int) (Math.random() * NUM_RANGE) + 1;
                    System.out.println("Your quickpick #" + (i + 1) + " is: " + numsPicked[i]);
                }
            } else {
                // manually assign each num picked by user...
                numsPicked = userPicks;
            }


            // check if we've won!
            int ballsMatched = 0;

            // bad way of debugging
            System.out.println("######### CHECK BUG  ############");
            System.out.println("Value in ballsMatched is: " + ballsMatched);


            for (int i = 0; i < NUM_BALLS; i++) {
                if (numsPicked[i] == winningNums[i]) {
                    ballsMatched++;
                }
            }

            winnings = ((double) ballsMatched / NUM_BALLS) * PRIZE_MONEY;


            System.out.println("Your picks are: ");
            for (int each : numsPicked) {
                System.out.print(each + " ");
            }
            System.out.println("\nWinning numbers are: ");
            for (int each : winningNums) {
                System.out.print(each + " ");
            }

            System.out.println("\n\nYou matched: " + ballsMatched + " out of " + NUM_BALLS);
            System.out.println("Your winnings are: " + winnings);

            simCount++;
        }

        System.out.println("Times simulation was run: " + simCount);


    }
}

