import java.util.ArrayList;

public class Tofu extends Protein {
    @Override
    public ArrayList<Protein> makeProteinDiet(int quantity) {
        ArrayList<Protein> tofuDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Tofu tofu = new Tofu();
            tofuDiet.add(tofu);
        }

        System.out.println("Added " + quantity + " amount of tofu to plan");
        return tofuDiet;
    }
}