// A "factory" that randomly creates shapes.
package polymorphism.shape;

import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random(42);

    public Shape next() {
        int i = rand.nextInt(4);
        System.out.println("i = " + i);
        switch (i) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Shape();
        }
    }
}
