import java.util.Random;

public class VeganFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getInstance();
    private ProteinFactory proteinFactory = ProteinFactory.getInstance();
    private FatsFactory fatsFactory = FatsFactory.getInstance();

    @Override 
    public Carbs createCarbsDiet() {
        String[] choices = {"pistachio", "bread", "lentils"};
        String choice = choices[new Random().nextInt(choices.length)];

        return carbsFactory.getCarbs(choice);
    }

    @Override 
    public Protein createProteinDiet() {
        return proteinFactory.getProtein("tofu");
    }

    @Override 
    public Fats createFatsDiet() {
        String[] choices = {"avocado", "peanuts"};
        String choice = choices[new Random().nextInt(choices.length)];

        return fatsFactory.getFats(choice);

    }
}