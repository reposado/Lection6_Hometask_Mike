public class Car extends Toys {

    private String color;
    private String kind;

    public Car() {
        super();
        this.color = "";
        this.kind = "";
    }
    public Car (String id, double cost, String manufactor, String name, boolean stockAvailability,
                String material, String color,String kind){
        super(id,  cost, manufactor, name,  stockAvailability);
        this.color = color;
        this.kind = kind;
    }
}