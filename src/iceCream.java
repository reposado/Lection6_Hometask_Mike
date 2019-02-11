import javafx.scene.input.DataFormat;

public class iceCream extends Food {

    private String taste;

    public iceCream() {
        super();
        this.taste = "";
    }
    public iceCream (String id, double cost, String manufactor, String name, boolean stockAvailability,
                     DataFormat shelfLife, String composition, int storageTemperature, String taste){
        super(id, cost, manufactor, name, stockAvailability, shelfLife, composition, storageTemperature);
        this.taste = taste;
    }
}