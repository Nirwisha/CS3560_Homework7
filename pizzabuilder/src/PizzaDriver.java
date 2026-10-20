public class PizzaDriver {
    public static void main(String[] args) {

        //PART I

        Pizza pizzaSmall = new PizzaBuilder()
            .setChain("Pizza Hut")
            .setSize("Small")
            .setPepperoni(true)
            .setMushrooms(true)
            .setHamPineapple(true)
            .createPizza();

        Pizza pizzaMedium = new PizzaBuilder()
            .setChain("Pizza Hut")
            .setSize("Medium")
            .setPepperoni(true)
            .setMushrooms(true)
            .setChicken(true)
            .setOnions(true)
            .setHam(true)
            .setExtraCheese(true)
            .createPizza();
        
        Pizza pizzaLarge = new PizzaBuilder()
            .setChain("Pizza Hut")
            .setSize("Large")
            .setPepperoni(true)
            .setMushrooms(true)
            .setChicken(true)
            .setOnions(true)
            .setHam(true)
            .setExtraCheese(true)
            .setSausage(true)
            .setPeppers(true)
            .setOlives(true)
            .createPizza();

        System.out.println("Initial Pizzas Eaten:");
        printPizza(pizzaSmall);
        printPizza(pizzaMedium);
        printPizza(pizzaLarge);

        //PART II

        Pizza pizzaHutLarge = new PizzaBuilder()
            .setChain("Pizza Hut")
            .setSize("Large")
            .setChicken(true)
            .setOnions(true)
            .setPeppers(true)
            .createPizza();

        Pizza pizzaHutSmall = new PizzaBuilder()
            .setChain("Pizza Hut")
            .setSize("Small")
            .setBeef(true)
            .setPesto(true)
            .createPizza();

        Pizza littleCaesarsMedium = new PizzaBuilder()
            .setChain("Little Caesars")
            .setSize("Medium")
            .setChicken(true)
            .setHam(true)
            .setExtraCheese(true)
            .setBacon(true)
            .setPepperoni(true)
            .setSpinach(true)
            .setMushrooms(true)
            .setSpicyPork(true)
            .createPizza();

        Pizza littleCaesarsSmall = new PizzaBuilder()
            .setChain("Little Ceasers")
            .setSize("Small")
            .setExtraCheese(true)
            .setBacon(true)
            .setHamPineapple(true)
            .setOlives(true)
            .setOnions(true)
            .setSpinach(true)
            .createPizza();

        Pizza dominosSmall = new PizzaBuilder()
            .setChain("Dominos")
            .setSize("Small")
            .setPepperoni(true)
            .createPizza();

        Pizza dominosLarge = new PizzaBuilder()
            .setChain("Dominos")
            .setSize("Large")
            .setHamPineapple(true)
            .setTomatoBasil(true)
            .setPesto(true)
            .createPizza();

        System.out.println("\nMore Pizza Eaten:");
        printPizza(pizzaHutLarge);
        printPizza(pizzaHutSmall);
        printPizza(littleCaesarsMedium);
        printPizza(littleCaesarsSmall);
        printPizza(dominosSmall);
        printPizza(dominosLarge);

    }

    public static void printPizza(Pizza pizza) {
        pizza.eat();
        System.out.println();
    }

}
