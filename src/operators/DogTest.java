package operators;

// operators/DogTest.java
// TIJ4 Chapter Operators, Exercise 5, page 105
/* Create a class called Dog containing two Strings: name and says.
 * In main(), create two dog objects with names "spot" (who says "Ruff!") and
 * "scruffy" (who says "Wurf!").  Then display their names and what they say.
 */
// TIJ4 Chapter Operators, Exercise 6, page 105
/* Create a class called Dog containing two Strings: name and says.
 * Following exercise 5, create a new Dog reference and assign it to spot's
 * object. Test for comparison using == and equals() for all references.
 */

class Dog {
    String name;
    String says;

    public Dog() {} // empty constuctor

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    void setName(String n) {
        name = n;
    }
    void setSays(String s) {
        says = s;
    }
    void showName() {
        System.out.println(name);
    }
    void speak() {
        System.out.println(says);
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();

        /*
        Dog dog = spot;
        System.out.println(dog == spot);
        System.out.println(dog.equals(spot)); // by default, check references
        // equals() can be overridden in the Dog class
        */

        Dog butch = new Dog();
        butch.setName("Butch");
        butch.setSays("Hello!");
        butch.showName();
        butch.speak();
        System.out.println("Comparison: ");
        System.out.println("spot == butch: " + (spot == butch));
        System.out.println("spot.equals(butch): " + spot.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(spot));
        System.out.println("Now assign: spot = butch");
        spot = butch;
        System.out.println("Compare again: ");
        System.out.println("spot == butch: " + (spot == butch));
        System.out.println("spot.equals(butch): " + spot.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(spot));
        System.out.println("Spot: ");
        spot.showName();
        spot.speak();
        System.out.println("Butch: ");
        butch.showName();
        butch.speak();
    }
}
