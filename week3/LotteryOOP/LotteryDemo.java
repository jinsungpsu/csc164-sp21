public class LotteryDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Lottery drawing2021jan25 = new Lottery();
            Lottery drawing2021jan27 = new Lottery();

            LotteryPlayer mrAn = new LotteryPlayer();
            LotteryPlayer santos = new LotteryPlayer();

            mrAn.quickPicks();
            santos.quickPicks();

            drawing2021jan25.drawWinningNums();
            drawing2021jan27.drawWinningNums();

            mrAn.checkWinnings(drawing2021jan25);
            mrAn.checkWinnings(drawing2021jan27);
            santos.checkWinnings(drawing2021jan27);
        }
    }
}
