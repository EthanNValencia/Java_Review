
public class PolymorphismExperiment {
    public static void main(String... args) {
        BaseClass test = new DerivedClass();
        test.foo();
        test.bar();
    }
}

class BaseClass {
    public void foo() {
        System.out.println("In BaseClass.foo()");
    }
    void bar() {
        System.out.println("In BaseClass.bar()");
    }
}

class DerivedClass extends BaseClass {
    public void foo() {
        System.out.println("In DerivedClass.foo()");
    }
    // void bar() { System.out.println("In DerivedClass.bar()");}
}