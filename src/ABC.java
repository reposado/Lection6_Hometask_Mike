public class ABC extends Books {

    private String language;

    public ABC() {
        super();
        this.language = "";
    }
    public ABC (String id, double cost, String manufactor, String name, boolean stockAvailability,
                int numberOfPages, String author, String thematics, String format, String language){
        super(id,  cost, manufactor, name,  stockAvailability, numberOfPages, author,thematics, format);
        this.language = language;
    }
}