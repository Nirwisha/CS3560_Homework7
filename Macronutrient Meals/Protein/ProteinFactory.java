import java.util.ArrayList;

public class ProteinFactory {
    
    private static ProteinFactory instance;

    private ProteinFactory(){}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;

    }
   
    public Protein getProtein(String type) {
        switch (type.toLowerCase()) {
            case "beef":
                return new Beef();
            case "chicken":
                return new Chicken();
            case "fish":
                return new Fish();
            case "tofu":
                return new Tofu();
            default:
                return null;

        }
    }

    public ArrayList<Protein> getProteinDiet(int quantity, String type) {
        Protein protein = getProtein((type));
        return protein.makeProteinDiet(quantity);
    }
}