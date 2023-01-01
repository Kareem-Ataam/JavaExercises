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
   public  float getPrice(){return price+89;}

    public void setHeroCharacter(String heroCharacter) {
        this.heroCharacter = heroCharacter;
    }

    public String getHeroCharacter() {
        return heroCharacter;
    }
}
public class CartoonBook extends Book {
    String heroCartoon;
    @Override
    public  float getPrice(){return price+87;}

    public void setHeroCartoon(String heroCartoon) {
        this.heroCartoon = heroCartoon;
    }

    public String getHeroCartoon() {
        return heroCartoon;
    }
}