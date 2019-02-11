public class Main {
        public static void main (String[] args){
            Shop shop = new Shop ();
            try {
                GoodsForChilderens good = shop.buy ("123123123");
            }
            catch (IllegalArgumentException e){
                System.out.println(e);
                throw e;
            }
        }
    }