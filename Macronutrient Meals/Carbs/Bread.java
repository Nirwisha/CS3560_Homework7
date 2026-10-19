import java.util.ArrayList;

public class Bread extends Carbs {
    @Override
    public ArrayList<Carbs> makeCarbsDiet(int quantity) {
        ArrayList<Carbs> breadDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Bread bread = new Bread();
            breadDiet.add(bread);
        }

        System.out.println("Added " + quantity + " amount of bread to plan");
        return breadDiet;
    }
}