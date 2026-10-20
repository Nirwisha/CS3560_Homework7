import java.util.ArrayList;

public class Beef extends Protein {
    @Override
    public ArrayList<Protein> makeProteinDiet(int quantity) {
        ArrayList<Protein> beefDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Beef beef = new Beef();
            beefDiet.add(beef);
        }

        System.out.println("Added " + quantity + " amount of beef to plan");
        return beefDiet;
    }
}