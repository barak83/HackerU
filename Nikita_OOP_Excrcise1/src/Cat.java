/**
 * Created by hackeru on 9/27/2017.
 */
public class Cat extends Animal {

    //Cat does: makeNoise & drink
    void makeNoise(){
        System.out.println("Cat says miao");
    }
    void drink(String beverage){
        switch (beverage){
            case "water": case "milk":
                System.out.println("Cat gladly drinks "+beverage);
                break;
            default:
                System.out.println("Cat refuse to drink "+beverage);
        }
    }
}
