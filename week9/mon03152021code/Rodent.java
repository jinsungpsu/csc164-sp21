public class Rodent extends Animal {
    boolean carryingDisease;

    public void speak() {
        System.out.println("squeak");
    }

    public boolean isCarryingDisease() {
        return carryingDisease;
    }

    public void setCarryingDisease(boolean carryingDisease) {
        this.carryingDisease = carryingDisease;
    }
}
