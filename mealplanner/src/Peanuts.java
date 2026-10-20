import java.util.ArrayList;

public class Peanuts extends Fats {
    @Override
    public ArrayList<Fats> makeFatsDiet(int quantity) {
        ArrayList<Fats> peanutsDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Peanuts peanuts = new Peanuts();
            peanutsDiet.add(peanuts);
        }

        System.out.println("Added " + quantity + " amount of peanuts to plan");
        return peanutsDiet;
    }
}