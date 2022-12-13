public class Task {
    public static void main(String [] args){
        Triangle t1 = new Triangle();
        t1.setEdges(10, 10, 10);
        System.out.println("The area is:" + t1.area());
        System.out.println("The circumference is:" + t1.circum());

    }
}