package lesson3.p2.publicModfier.package2;

import lesson3.p2.publicModfier.package1.A;

public class C {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
        int c = a.varA;
    }
}
