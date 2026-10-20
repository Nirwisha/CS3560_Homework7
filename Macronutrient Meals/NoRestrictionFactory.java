import java.util.Random;

public class NoRestrictionFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getInstance();
    private ProteinFactory proteinFactory = ProteinFactory.getInstance();
    private FatsFactory fatsFactory = FatsFactory.getInstance();

    @Override 
    public Carbs createCarbsDiet() {
        String[] choices = {"cheese", "bread", "lentils", "pistachio"};
        String choice = choices[new Random().nextInt(choices.length)];

        return carbsFactory.getCarbs(choice);
    }

    @Override 
    public Protein createProteinDiet() {
        String[] choices = {"beef", "chicken", "fish", "tofu"};
        String choice = choices[new Random().nextInt(choices.length)];

        return proteinFactory.getProtein(choice);
    }

    @Override 
    public Fats createFatsDiet() {
        String[] choices = {"avocado", "sour cream", "tuna", "peanuts"};
        String choice = choices[new Random().nextInt(choices.length)];

        return fatsFactory.getFats(choice);

    }
}