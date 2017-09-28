import java.util.Arrays;

/**
 * Created by hackeru on 9/27/2017.
 */
public class Tester {
    public static void main(String[] args) {

        Human h1 = new Human("Shlomi");
        final int r = 15, max = 40;
        Wheel [] wheels = new Wheel[4];
        for(int i=0; i<4; i++){
            wheels[i] = new Wheel(r, max);
            wheels[i].inflate(max - 5);
        }
        Car c1 = new Car(wheels);
        c1.wheels[0].deflate();
        for(Wheel w : wheels) System.out.println(w.currentPsi);

    }
}
