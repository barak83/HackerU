/**
 * Created by hackeru on 9/27/2017.
 */
public class Tester {
    static int cv = 1;//Class variable
    int iv = 2;//Instance variable

    static void doSome(int param){//Parameter
        {{
            {
                int lv=1;//local variable
            }
            {
                int lv=2;//local variable of another scope
            }
        }}
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Animal a1 = c1;
        /*

        System.out.println(c1 instanceof Cat);
        System.out.println(c1 instanceof Object);
        System.out.println(a1 instanceof Object);
        System.out.println(a1 instanceof Animal);
        System.out.println(a1 instanceof Cat);
        System.out.println(a1 instanceof Dog);
        /*
        User u1 = new User();
        u1.name = "Bubu";

        Tractor p1 = new Tractor();
        p1.owner = u1;
        /*/
        a1.makeNoise();
        a1=new Dog();
        a1.makeNoise();

        //*/
    }


}