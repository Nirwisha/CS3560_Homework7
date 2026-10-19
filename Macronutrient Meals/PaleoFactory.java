public class PaleoFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getCarbsDiet();
    private ProteinFactory proteinFactory = ProteinFactory.getProteinDiet();
    private FatsFactory fatsFactory = FatsFactory.getFatsDiet();

    @Override 
    public Carbs createCarbsDiet() {
        return carbsFactory.getCarbs("Paleo");
    }

    @Override 
    public Protein createProteinDiet() {
        return proteinFactory.getProtein("Paleo");
    }

    @Override 
    public Fats createFatsDiet() {
        return fatsFactory.getFats("Paleo");

    }
}