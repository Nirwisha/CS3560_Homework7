import java.util.ArrayList;

public class Chicken extends Protein {
    @Override
    public ArrayList<Protein> makeProteinDiet(int quantity) {
        ArrayList<Protein> chickenDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Chicken chicken = new Chicken();
            chickenDiet.add(chicken);
        }

        System.out.println("Added " + quantity + " amount of chicken to plan");
        return chickenDiet;
    }
}