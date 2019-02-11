import javafx.scene.input.DataFormat;

public class Food extends GoodsForChilderens {
    private DataFormat shelfLife;
    private String composition;
    private int storageTemperature;

    public Food() {
        super();
        this.shelfLife = null;
        this.composition = "";
        this.storageTemperature = 0;
    }
    public Food (String id, double cost, String manufactor, String name, boolean stockAvailability,
                 DataFormat shelfLife, String composition, int storageTemperature) {
        super(id, cost, manufactor, name, stockAvailability);
        this.shelfLife = shelfLife;
        this.composition = composition;
        this.storageTemperature = storageTemperature;
    }
}