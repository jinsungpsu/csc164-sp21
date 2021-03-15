public class Cat extends Animal {
    public Cat() {

    }

    public void speak() {
        System.out.println("Meow");
    }

    public Cat(int bdayMonth, int bdayDay, int bdayYear) {
        this.setBdayDay(bdayDay);
        this.setBdayMonth(bdayMonth);
        this.setBdayYear(bdayYear);
        // calling Animal(bdayMonth, bdayDay, bdayYear);
    }
}
