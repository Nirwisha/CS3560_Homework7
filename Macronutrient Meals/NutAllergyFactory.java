public class NutAllergyFactory extends MacronutrientFactory {
    private CarbsFactory carbsFactory = CarbsFactory.getCarbsDiet();
    private ProteinFactory proteinFactory = ProteinFactory.getProteinDiet();
    private FatsFactory fatsFactory = FatsFactory.getFatsDiet();

    @Override 
    public Carbs createCarbsDiet() {
        return carbsFactory.getCarbs("Nut Allergy");
    }

    @Override 
    public Protein createProteinDiet() {
        return proteinFactory.getProtein("Nut Allergy");
    }

    @Override 
    public Fats createFatsDiet() {
        return fatsFactory.getFats("Nut Allergy");

    }
}