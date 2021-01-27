public class LotteryPlayer {
    final int NUM_BALLS = 6;
    final int NUM_RANGE = 10;
    int[] numsPicked = new int[NUM_BALLS];


    void quickPicks() {
        for (int i = 0; i < NUM_BALLS; i++) {
            numsPicked[i] = (int) (Math.random() * NUM_RANGE) + 1;
            System.out.println("Your quickpick #" + (i + 1) + " is: " + numsPicked[i]);
        }
    }

    String userPicks() {
        String output="";
        for (int i = 0; i < NUM_BALLS; i++) {
            output+=numsPicked[i] + " ";
        }
        return output;
    }

    void checkWinnings(Lottery lotteryToCheck) {
        // check if we've won!
        int ballsMatched = 0;

        int[] winningNums = lotteryToCheck.getWinningNums();
        final double PRIZE_MONEY = lotteryToCheck.maxPrizeMoney;

        for (int i = 0; i < NUM_BALLS; i++) {
            if (numsPicked[i] == winningNums[i]) {
                ballsMatched++;
            }
        }

        double winnings = ((double) ballsMatched / NUM_BALLS) * PRIZE_MONEY;


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
    }
}
