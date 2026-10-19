import java.util.ArrayList;

public class Lentils extends Carbs {
    @Override
    public ArrayList<Carbs> makeCarbsDiet(int quantity) {
        ArrayList<Carbs> lentilsDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Lentils lentils = new Lentils();
            lentilsDiet.add(lentils);
        }

        System.out.println("Added " + quantity + " amount of lentil to plan");
        return lentilsDiet;
    }
}