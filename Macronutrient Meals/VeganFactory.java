public class VeganFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getCarbsDiet();
    private ProteinFactory proteinFactory = ProteinFactory.getProteinDiet();
    private FatsFactory fatsFactory = FatsFactory.getFatsDiet();

    @Override 
    public Carbs createCarbsDiet() {
        return carbsFactory.getCarbs("Vegan");
    }

    @Override 
    public Protein createProteinDiet() {
        return proteinFactory.getProtein("Vegan");
    }

    @Override 
    public Fats createFatsDiet() {
        return fatsFactory.getFats("Vegan");

    }
}