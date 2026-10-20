import java.util.ArrayList;

public class SourCream extends Fats {
    @Override
    public ArrayList<Fats> makeFatsDiet(int quantity) {
        ArrayList<Fats> sourCreamDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            SourCream sourCream = new SourCream();
            sourCreamDiet.add(sourCream);
        }

        System.out.println("Added " + quantity + " amount of sour cream to plan");
        return sourCreamDiet;
    }
}