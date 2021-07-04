import java.util.Random;

public class Distance {
    int distance=0;
    Random random = new Random();
    final int maxHop = 11; // max distance increment per iteration, centimeters

    Distance (){}

    synchronized void increment(){
        distance += random.nextInt(maxHop);
    }

    synchronized int get(){
        return distance;
    }

}
