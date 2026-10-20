import java.util.ArrayList;

public class Avocado extends Fats {
    @Override
    public ArrayList<Fats> makeFatsDiet(int quantity) {
        ArrayList<Fats> avocadoDiet = new ArrayList<> ();

        for (int i = 1; i <= quantity; i++) {
            Avocado avocado = new Avocado();
            avocadoDiet.add(avocado);
        }

        System.out.println("Added " + quantity + " amount of avocado to plan");
        return avocadoDiet;
    }
}