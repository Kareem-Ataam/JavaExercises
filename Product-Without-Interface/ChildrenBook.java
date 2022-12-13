package MyOnlineShop;
abstract class Product{
    protected float price;
    protected String type;
    protected String name;
    Product(float price,String type,String name){
        this.price = price;
        this.type  = type;
        this.name  = name;
    }
    void setPrice(float price){
        this.price = price;
    }
    float getPrice(){return price;}
    void setType(String type){
        this.type = type;
    }
    String getType(){return type;}

}
class Book extends Product {
    String ISBN;
    Book(String ISBN,float price,String type,String name){
        super(price,type,name);
        this.ISBN = ISBN;
    }

}
public class ChildrenBook extends Book {
    String heroCharacter;
    ChildrenBook(String heroCharacter,String ISBN,float price,String type,String name){
        super(ISBN,price,type,name);
        this.ISBN = ISBN;
    }
}
