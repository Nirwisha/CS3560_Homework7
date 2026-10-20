public class Meal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void displayMeal() {
        System.out.println("Carbs: " + carbs.getClass().getSimpleName());
        System.out.println("Protein: " + protein.getClass().getSimpleName());
        System.out.println("Fats: " + fats.getClass().getSimpleName());
    }
}
