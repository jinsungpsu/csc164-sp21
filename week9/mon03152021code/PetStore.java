public class PetStore {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, 1, 2021);
        Cat cat2 = new Cat(1,2, 2020);

        Cat[] catsForSale = {cat1, cat2};

        cat1.setRetailPrice(500);

        Dog dog1 = new Dog(3, 15, 2014);
        Dog dog2 = new Dog(3, 16, 2020);

        dog1.setRetailPrice(5000);


        GuineaPig gp1 = new GuineaPig();

        cat1.speak();
        dog1.speak();
        gp1.speak();

    }
}
