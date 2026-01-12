// p/B.java
package p;
public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x); // OK: same package
    }
}
