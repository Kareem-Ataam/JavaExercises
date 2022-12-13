package MyOnlineShop;
public class Main {
    public static void main(String[] args) {

        Product []arr = new Product[10];
        arr[0] = new ChildrenBook("Tensor","199202",199.5f,"Animal","Kasper");
        arr[1] = new ChildrenBook("Tensor","199202",10.5f,"Animal","Kasper");
        arr[2] = new ChildrenBook("Tensor","199202",999.0f,"Animal","Kasper");
        float sum = 0.0f;
        for(int i=0;i<3;i++){
            sum += arr[i].getPrice();
        }
        System.out.println("The total price for the Children books:" + sum);
    }
}