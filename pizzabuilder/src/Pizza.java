public class Pizza {

    private String chain;
    private String size;

    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamPineapple;

    public Pizza(String chain, String size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, 
        boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomatoBasil, boolean beef, 
        boolean ham, boolean pesto, boolean spicyPork, boolean hamPineapple) {
            this.chain = chain;
            this.size = size;
            this.pepperoni = pepperoni;
            this.sausage = sausage;
            this.mushrooms = mushrooms;
            this.bacon = bacon;
            this.onions = onions;
            this.extraCheese = extraCheese;
            this.peppers = peppers;
            this.chicken = chicken;
            this.olives = olives;
            this.spinach = spinach;
            this.tomatoBasil = tomatoBasil;
            this.beef = beef;
            this.ham = ham;
            this.pesto = pesto;
            this.spicyPork = spicyPork;
            this.hamPineapple = hamPineapple;
    }

    public void eat() {
        StringBuilder toppings = new StringBuilder();

        addTopping(toppings, "Pepperoni", pepperoni);
        addTopping(toppings, "Sausage", sausage);
        addTopping(toppings, "Mushrooms", mushrooms);
        addTopping(toppings, "Bacon", bacon);
        addTopping(toppings, "Onions", onions);
        addTopping(toppings, "Extra Cheese", extraCheese);
        addTopping(toppings, "Peppers", peppers);
        addTopping(toppings, "Chicken", chicken);
        addTopping(toppings, "Olives", olives);
        addTopping(toppings, "Spinach", spinach);
        addTopping(toppings, "Tomato and Basil", tomatoBasil);
        addTopping(toppings, "Beef", beef);
        addTopping(toppings, "Ham", ham);
        addTopping(toppings, "Pesto", pesto);
        addTopping(toppings, "Spicy Pork", spicyPork);
        addTopping(toppings, "Ham and Pineapple", hamPineapple);

        System.out.println("\nPizza Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);
    }

    private void addTopping(StringBuilder toppings, String toppingName, boolean selected) {
        if (selected) {
            if (toppings.length() > 0) {
                toppings.append(", ");
            }

            toppings.append(toppingName);
        }
    }
    
}
