import java.util.ArrayList;

public class FatsFactory {

    private static FatsFactory instance;

    private FatsFactory(){}

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;

    }

    public Fats getFats(String type) {
        switch (type.toLowerCase()) {
            case "avocado":
                return new Avocado();
            case "peanuts":
                return new Peanuts();
            case "sour cream":
                return new SourCream();
            case "tuna":
                return new Tuna();
            default:
                return null;

        }
    }

    public ArrayList<Fats> getFatsDiet(int quantity, String type) {
        Fats fats = getFats((type));
        return fats.makeFatsDiet(quantity);
    }
}