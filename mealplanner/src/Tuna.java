import java.util.ArrayList;

public class Tuna extends Fats {
    @Override
    public ArrayList<Fats> makeFatsDiet(int quantity) {
        ArrayList<Fats> tunaDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Tuna tuna = new Tuna();
            tunaDiet.add(tuna);
        }

        System.out.println("Added " + quantity + " amount of tuna to plan");
        return tunaDiet;
    }
}