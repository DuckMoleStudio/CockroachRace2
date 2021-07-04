import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        final int raceDistance = 100; // total race distance, centimeters
        String[] racerNames = {"Black Pearl", "Yanychar", "Pugowitza", "Baby Don't Cry", "Hooligan"};
        List<Cockroach> racers = new ArrayList<>();
        boolean endOfRace = false;
        String winner = "none";

        for(String racer : racerNames){
            racers.add(new Cockroach(racer));
        }

        for (Cockroach curCockroach: racers) {
            curCockroach.start();
        }

        System.out.println("\n\n--- Race is on! ---");

        while(!endOfRace) {
            System.out.println("\n");
            try {
                Thread.sleep(1000);
                for (Cockroach curCockroach : racers) {

                    System.out.printf("%s: at %d cm (in %d hops) \n",
                            curCockroach.getName(),
                            curCockroach.curDistance.get(),
                            curCockroach.hopCounter);
                    if (curCockroach.curDistance.get() >= raceDistance) {
                        endOfRace = true;
                        winner = curCockroach.getName();
                    }
                }
            }
                catch(InterruptedException e){
                    System.out.println("Thread has been interrupted");
                }
            }


        System.out.printf("\n--- Race stopped! %s wins! ---\n", winner);

        for (Cockroach curCockroach : racers){
            curCockroach.interrupt();
        }

    }

}
