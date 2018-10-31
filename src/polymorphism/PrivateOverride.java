// Trying to override a private method.
// Not expected output for me!

package polymorphism;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        // this method will be not called because a private method
        // is automatically final, and is also hidden from the derived class
        System.out.println("public f()");
    }
}