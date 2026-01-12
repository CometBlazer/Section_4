// q/C.java
package q;
import p.A;
public class C {
    public static void main(String[] args) {
        A a = new A();
        // System.out.println(a.x); // ERROR: x not visible outside package p
    }
}
