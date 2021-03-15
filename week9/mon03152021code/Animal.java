public class Animal {
    private int bdayMonth = 1;
    private int bdayDay = 1;
    private int bdayYear = 2021;

    private String name = "unnamed";

    private double wholesalePrice = 0;
    private double retailPrice = 0;

    public Animal() {

    }

    public Animal(int bdayMonth, int bdayDay, int bdayYear) {
        this.bdayMonth = bdayMonth;
        this.bdayDay = bdayDay;
        this.bdayYear = bdayYear;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Uhh... I'm an animal!");
    }

    public int getBdayMonth() {
        return bdayMonth;
    }

    public void setBdayMonth(int bdayMonth) {
        this.bdayMonth = bdayMonth;
    }

    public int getBdayDay() {
        return bdayDay;
    }

    public void setBdayDay(int bdayDay) {
        this.bdayDay = bdayDay;
    }

    public int getBdayYear() {
        return bdayYear;
    }

    public void setBdayYear(int bdayYear) {
        this.bdayYear = bdayYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
