import java.util.ArrayList;

public class Cheese extends Carbs {
    @Override
    public ArrayList<Carbs> makeCarbsDiet(int quantity) {
        ArrayList<Carbs> cheeseDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Cheese cheese = new Cheese();
            cheeseDiet.add(cheese);
        }

        System.out.println("Added " + quantity + " amount of cheese to plan");
        return cheeseDiet;
    }
}