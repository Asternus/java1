package lesson3.p2.privateModfier;

public class A {
    private int varA;

    private void methodA() {
    }

    public static void main(String[] args) {
        A a = new A();
        a.methodA();
        int b = a.varA;
    }
}
