public class Lottery {
    final int NUM_BALLS = 6;
    final int NUM_RANGE = 10;

    int winningNums[] = new int[NUM_BALLS];

    double maxPrizeMoney = 1000000;

    int[] getWinningNums() {
        return winningNums;
    }

    void drawWinningNums() {
        for (int i = 0; i < NUM_BALLS; i++) {
            winningNums[i] = (int) (Math.random() * NUM_RANGE) + 1;
            System.out.println("Lottery winning ball #" + (i + 1) + " is: " + winningNums[i]);
        }
    }
}
