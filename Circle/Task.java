public class Task {
    public static void main(String [] args){
        Circle c1 = new Circle();
        c1.setRadius(10.0);
        System.out.println("The area is:" + c1.area());
        System.out.println("The circumference is:" + c1.circum());
    }
}