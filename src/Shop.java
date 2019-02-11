import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<GoodsForChilderens> shop = new ArrayList<GoodsForChilderens>();
    private static final String Pattern = "[0-9]*";
    public Shop (){

    }
    public Shop (List<GoodsForChilderens> shop) {this.shop = shop;}

    public GoodsForChilderens buy (String id){
        if (id == null){
            throw new IllegalArgumentException("id должен быть заполнен");
        }
        if (!id.matches(Pattern)){
            throw new IllegalArgumentException("id должен содержать только цифры от 0 до 9");
        }
        for (GoodsForChilderens good : shop){
            if (id.equals(good.getId())) {
                return good;
            }
        }
        return null;
    }
}