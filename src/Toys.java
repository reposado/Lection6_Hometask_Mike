public class Toys extends GoodsForChilderens {
    private String material;

    public Toys(){
        super();
        this.material = "";
    }
    public Toys(String id, double cost, String manufactor, String name, boolean stockAvailability) {
        super(id,  cost, manufactor, name,  stockAvailability);
        this.material = material;
    }
}