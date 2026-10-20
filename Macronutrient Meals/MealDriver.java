public static Meal generateMealForCustomer (Customer customer) {
    MacronutrientFactory factory = MacronutrientFactoryCreator.createFactory(customer.getDietPlan());

    Carbs carbs = factory.createCarbsDiet();
    Protein protein = factory.createProteinDiet();
    Fats fats = factory.createFatsDiet();

    return new Meal(carbs, protein, fats);
}