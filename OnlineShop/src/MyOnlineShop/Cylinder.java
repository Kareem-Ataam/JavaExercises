package MyOnlineShop;

class Circle {
    private double radius=1;
    private String color ="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ", color=" + color + "]";
    }
    public double getArea(){
        return Math.PI* Math.pow(radius,2);
    }
}


public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder( double height,double radius,String color) {
        super(radius,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + "height=" + height + ']';
    }
    public double getVolume(){
        return this.getArea() * height;
    }
}
