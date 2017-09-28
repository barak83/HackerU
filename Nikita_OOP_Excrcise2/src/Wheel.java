/**
 * Created by hackeru on 9/27/2017.
 */
public class Wheel {
    final int radius, maxPsi;
          int currentPsi;
    public Wheel(int radius, int maxPsi){
        this.radius = radius;
        this.maxPsi = maxPsi;
        this.currentPsi = 0;
    }
    public void inflate(int psi){
        if(psi > 0 && psi <= maxPsi)while(currentPsi < psi)currentPsi++;
    }
    public void deflate(){
        while(currentPsi > 0)currentPsi--;
    }
}
