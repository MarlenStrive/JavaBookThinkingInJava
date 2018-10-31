package polymorphism;

// polymorphism/biking/Biking.java
// TIJ4 Chapter Polymorphism, Exercise 1, page 281
/* Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride()
 * method.
 */

import org.jetbrains.annotations.NotNull;

class Cycle {
    private String name;
    private int wheels = 0;

    public void setName(String name) {
        this.name = name;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    Cycle(String name) {
        setName(name);
    }
    Cycle(String name, int wheels) {
        this(name);
        setWheels(wheels);
    }

    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }

    public String toString() {
        return this.name + ", wheels " + wheels;
    }
}

class Unicycle extends Cycle {
    Unicycle() {
        super("Unicycle", 1);
    }
}

class Bicycle extends Cycle {
    Bicycle() {
        super("Bicycle", 2);
    }
}

class Tricycle extends Cycle {
    Tricycle() {
        super("Tricycle", 3);
    }
}

public class Biking {
    public static void ride(@NotNull Cycle c) {
        c.travel(c);
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
