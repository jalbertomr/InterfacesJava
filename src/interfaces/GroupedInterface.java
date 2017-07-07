package interfaces;

/**
 * Created by Bext on 04/01/2017.
 */

interface interface1{   //not public, means that it is onlu acceccible only to classes defined in the same package
    public void methodToImplement(int arg);
};

interface interface2{};

interface interface3{};

//a class can extends only one other class, but interface can extends multiple interfaces
public interface GroupedInterface extends interface1, interface2, interface3 {
    //constant declarations all constants values defiened in interface are implicitly public, static and final
    // not neccessary to indicate
    //base of natural logarithms
    double E = 2.718282;

    //method signatures
    void doSomething(int i, double x);
    int doSomethingElse(String s);

    //abstract methods are implicitly public
    //default methods are implicitly public
    //static methods are implicitly public
}
