class A {
    public A(int a) {
        System.out.println("A(" + a + ")");
    }
}

class B extends A {
    public B (int a, int b){
        super(a);
        System.out.println("B(" + b + ")");
    }
}

class C extends B {
    public C(int a, int b, int c) {
        super(a, b);
        System.out.println("C(" + c + ")");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new C(1, 2, 3);
    }
}
