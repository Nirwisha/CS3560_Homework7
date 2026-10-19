

public static Meal generateMealForCustomer (Customer customer) {
    MacronutrientFactory factory = MacronutrientFactoryCreator.createFactory(customer.getDietPlan());

    Carbs carbs = factory.createCarbs();
    Protein protein = factory.createProtein();
    Fats fats = factory.createFats();

    return new Meal(carbs, protein, fats);
}