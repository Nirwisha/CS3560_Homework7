import java.util.Random;

public class NutAllergyFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getInstance();
    private ProteinFactory proteinFactory = ProteinFactory.getInstance();
    private FatsFactory fatsFactory = FatsFactory.getInstance();

    @Override 
    public Carbs createCarbsDiet() {
        //random items for meal
        String[] choices = {"cheese", "bread", "lentils"};
        String choice = choices[new Random().nextInt(choices.length)];

        return carbsFactory.getCarbs(choice);
    }

    @Override 
    public Protein createProteinDiet() {
        //random items for meal
        String[] choices = {"beef", "chicken", "fish", "tofu"};
        String choice = choices[new Random().nextInt(choices.length)];

        return proteinFactory.getProtein(choice);
    }

    @Override 
    public Fats createFatsDiet() {
        //random items for meal
        String[] choices = {"avocado", "sour cream", "tuna"};
        String choice = choices[new Random().nextInt(choices.length)];

        return fatsFactory.getFats(choice);

    }
}