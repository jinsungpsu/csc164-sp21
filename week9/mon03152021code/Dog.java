public class Dog extends Animal{
    private boolean canPlayFetch;

    public Dog(int bdayMonth, int bdayDay, int bdayYear) {
        super(bdayMonth, bdayDay, bdayYear);
    }

    public boolean isCanPlayFetch() {
        return canPlayFetch;
    }

    public void setCanPlayFetch(boolean canPlayFetch) {
        this.canPlayFetch = canPlayFetch;
    }
}
