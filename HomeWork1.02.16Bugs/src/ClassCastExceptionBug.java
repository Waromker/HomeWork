import java.io.IOException;

public class ClassCastExceptionBug {

    public static void main(String[] args) throws IOException {

        A b =  new B();
        System.out.println(b.a);
        b.doSomethimg();
        System.out.println(b.getA());

    }
}

class A {

    int a = 10;

    A(){
        System.out.println("class A");
    }

    public void doSomethimg() {
        System.out.println("class A");
    }

    public int getA() {
        return a;
    }

}

class B extends A {

    int a = 20;

    public void doSomethimg() {
        System.out.println("class B");
    }

    public int getA() {
        return a;
    }
}
