import java.util.ArrayList;

public class CarbsFactory {

    private static CarbsFactory instance;

    private CarbsFactory(){}

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;

    }

    public Carbs getCarbs(String type) {
        switch (type.toLowerCase()) {
            case "cheese":
                return new Cheese();
            case "bread":
                return new Bread();
            case "lentils":
                return new Lentils();
            case "pistachio":
                return new Pistachio();
            default:
                return null;
        }
    }

    public ArrayList<Carbs> getCarbsDiet(int quantity, String type) {
        Carbs carbs = getCarbs((type));
        return carbs.makeCarbsDiet(quantity);
    }
}