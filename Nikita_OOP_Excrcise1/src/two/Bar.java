package two;

import one.Foo;

/**
 * Created by hackeru on 9/27/2017.
 */
public class Bar extends Foo {

    void doSome(){
        System.out.println(pub);
        System.out.println(prot);
        //System.out.println(def);//Cannot access
        //System.out.println(priv);//Cannot access
    }

}