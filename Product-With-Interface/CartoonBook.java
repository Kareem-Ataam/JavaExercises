package MyOnlineShop;

interface Product{
    float price = 130.9f;
    float getPrice();
}
abstract class Book implements Product {
    String ISBN;
}
class ChildrenBook extends Book {
    String heroCharacter;
    @Override
   public  float getPrice(){return price;}
}
public class CartoonBook extends Book {
    String heroCartoon;
    @Override
    public  float getPrice(){return price;}
}