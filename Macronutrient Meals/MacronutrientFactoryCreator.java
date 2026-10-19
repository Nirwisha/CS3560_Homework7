public class MacronutrientFactoryCreator {
    public static MacronutrientFactory createFactory(String dietPlan) {
        if (dietPlan.equalsIgnoreCase("No Restriction")) {
            return new NoRestrictionFactory();
        }
        else if (dietPlan.equalsIgnoreCase("Paleo")) {
            return new PaleoFactory();
        }
        else if (dietPlan.equalsIgnoreCase("Vegan")) {
            return new VeganFactory();
        }
        else if (dietPlan.equalsIgnoreCase("Nut Allergy")) {
            return new NutAllergyFactory();
        }
        else {
            System.out.println("Invalid diet plan.");
            return null;
        }
    }
}