public class Circle {
    double radius=0.0;
    public void setRadius(double r)
    {
        radius=r;
    }
    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double circum(){
        return 2*Math.PI * radius;
    }
}
