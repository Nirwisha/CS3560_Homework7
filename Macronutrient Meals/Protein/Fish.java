import java.util.ArrayList;

public class Fish extends Protein {
    @Override
    public ArrayList<Protein> makeProteinDiet(int quantity) {
        ArrayList<Protein> fishDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Fish fish = new Fish();
            fishDiet.add(fish);
        }

        System.out.println("Added " + quantity + " amount of fish to plan");
        return fishDiet;
    }
}