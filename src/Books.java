public class Books extends GoodsForChilderens {
    private int numberOfPages;
    private String author;
    private String thematics;
    private String format;

    public Books() {
        super();
        this.numberOfPages = 0;
        this.thematics = "";
        this.format = "";
        this.author = "";
    }

    public Books(String id, double cost, String manufactor, String name, boolean stockAvailability,
                 int numberOfPages, String author, String thematics, String format){
        super(id,  cost, manufactor, name,  stockAvailability);
        this.numberOfPages = numberOfPages;
        this.thematics = thematics;
        this.format = format;
        this.author = author;

    }

}