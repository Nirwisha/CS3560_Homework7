import java.util.Random;

public class PaleoFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getInstance();
    private ProteinFactory proteinFactory = ProteinFactory.getInstance();
    private FatsFactory fatsFactory = FatsFactory.getInstance();

    @Override 
    public Carbs createCarbsDiet() {
        return carbsFactory.getCarbs("pistachio");
    }

    @Override 
    public Protein createProteinDiet() {
        //random items for meal
        String[] choices = {"beef", "chicken", "fish"};
        String choice = choices[new Random().nextInt(choices.length)];

        return proteinFactory.getProtein(choice);
    }

    @Override 
    public Fats createFatsDiet() {
        String[] choices = {"avocado", "tuna", "peanuts"};
        String choice = choices[new Random().nextInt(choices.length)];

        return fatsFactory.getFats(choice);

    }
}