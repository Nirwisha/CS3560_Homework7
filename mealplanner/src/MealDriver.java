public class MealDriver {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Jerry", "No Restriction"),
            new Customer("Bruno", "Paleo"),
            new Customer("Maya", "Nut Allergy"),
            new Customer("Nikki", "Vegan"),
            new Customer("Oka", "Nut Allergy"),
            new Customer("Kenny", "No Restriction")
        };

        for (Customer customer : customers) {
            System.out.println("\nCustomer: " + customer.getName());
            System.out.println("Diet Plan: " + customer.getDietPlan());

            Meal meal = generateMealForCustomer(customer);
            meal.displayMeal();
        }
    }
    
    
    public static Meal generateMealForCustomer (Customer customer) {
        MacronutrientFactory factory = MacronutrientFactoryCreator.createFactory(customer.getDietPlan());
        
        Carbs carbs = factory.createCarbsDiet();
        Protein protein = factory.createProteinDiet();
        Fats fats = factory.createFatsDiet();
        
        return new Meal(carbs, protein, fats);
    }

}