package MyOnlineShop;
public class Main {
    public static void main(String[] args) {

        Product []arr = new Product[10];
        arr[0] = new ChildrenBook();
        arr[1] = new ChildrenBook();
        arr[2] = new ChildrenBook();
        arr[3] = new CartoonBook();
        arr[4] = new CartoonBook();
        arr[5] = new CartoonBook();
        float sumOfChildren = 0.0f;
        for(int i=0;i<3;i++){
            sumOfChildren += arr[i].getPrice();
        }
            float sumOfCartoon = 0.0f;
        for(int i=0;i<3;i++){
            sumOfCartoon += arr[i].getPrice();
        }
        System.out.println("The total price for the Children books:" + sumOfChildren);
        System.out.println("The total price for the Cartoon books:" + sumOfCartoon);
    }
}