import java.util.ArrayList;

public class Pistachio extends Carbs {
    @Override
    public ArrayList<Carbs> makeCarbsDiet(int quantity) {
        ArrayList<Carbs> pistachioDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Pistachio pistachio = new Pistachio();
            pistachioDiet.add(pistachio);
        }

        System.out.println("Added " + quantity + " amount of pistachio to plan");
        return pistachioDiet;
    }
}