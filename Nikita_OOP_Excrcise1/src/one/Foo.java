package one;

public class Foo {

    public      int pub  = 1;//Isn't encapsulated at all
    protected   int prot = 1;//Is encapsulated to class, package, sub-classes
                int def  = 1;//Is encapsulated to class, package
    private     int priv = 1;//Is encapsulated to class ONLY

}
