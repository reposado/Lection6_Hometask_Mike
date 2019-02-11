public class GoodsForChilderens {
    private String id;
    private double cost;
    private String manufactor;
    private String name;
    private boolean stockAvailability;

    public GoodsForChilderens () {
        this.id = "";
        this.cost = 0.0;
        this.manufactor = "";
        this.name = "";
        this.stockAvailability = false;
    }

    public GoodsForChilderens (String id, double cost, String manufactor, String name, boolean stockAvailability){
        this.id = id;
        this.cost = cost;
        this.manufactor = manufactor;
        this.name = name;
        this.stockAvailability = stockAvailability;
    }
    protected String getId () {return id;}
}