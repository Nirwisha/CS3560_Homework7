public class NoRestrictionFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getCarbsDiet();
    private ProteinFactory proteinFactory = ProteinFactory.getProteinDiet();
    private FatsFactory fatsFactory = FatsFactory.getFatsDiet();

    @Override 
    public Carbs createCarbsDiet() {
        return carbsFactory.getCarbs("No Restriction");
    }

    @Override 
    public Protein createProteinDiet() {
        return proteinFactory.getProtein("No Restriction");
    }

    @Override 
    public Fats createFatsDiet() {
        return fatsFactory.getFats("No Restriction");

    }
}