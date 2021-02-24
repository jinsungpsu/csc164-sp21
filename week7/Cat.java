/*
Add a method 'void setAge(String newAge)' to class Cat that sets the int field 'age' to a new value. Use Integer.parseInt("some string") to convert a string to an int
Add a method 'boolean isOld()' to class Cat that returns true if the cat's age is greater than 10.
Add a method 'boolean sameAge(Cat anotherCat)' to the class Cat that returns true if the other cat is the same age as this instance.

 */
class Cat {
    String name;
    String species;
    int age;
    String color;
    boolean isHungry;
    boolean isSleeping;
    double weight;
    Dog bestFriend;

    Cat() {
        System.out.println("Meow. Cat is born!");
        name = "stray cat";
        age = 0;
        isHungry = true;
        isSleeping = false;
        weight = 5.8;
    }

    void goToSleep() {
        isSleeping = true;
    }

    void eat() {
        weight += 0.1;
    }

    void setAge(String stringAge) {
        // the age is stored in String called age
        // let's convert that age to an int
        int ageNumConversion =  Integer.parseInt(stringAge);
        age = ageNumConversion;
    }

    boolean sameAge(Cat someCat) {
        // we need return true or false depending on their ages
        // we have to compare Tom and Garfield's ages
        System.out.println("this cat age: " + age); // the age for "THIS" cat (garfield)
        System.out.println("compared to some cat: " + someCat.age); // the age for "other cat" (tom)

    }

    void catStats() {
        if (color == null) {
            color = "don't know color yet!";
        }
        System.out.println("name: " + name
                + "\nspecies: " + species
                + "\nage: " + age
                + "\ncolor: " + color
                + "\nisHungry: " + isHungry
                + "\nisSleeping: " + isSleeping
                + "\nweight: " + weight);
    }

    public static void main(String[] args) {
        Cat garfield = new Cat(); // ref var pointing to object/instance
        Cat tom = new Cat();

        garfield.age = 5;
        garfield.setAge("5");
        tom.age = 50;

        garfield.goToSleep();

        tom.eat();

        garfield.catStats();
        tom.catStats();

        boolean isSameAge = garfield.sameAge(tom);
    }
}
