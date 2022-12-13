public class Triangle {
    double edge1=0.0;
    double edge2=0.0;
    double edge3=0.0;
    public void setEdges(int e1,int e2,int e3)
    {
        edge1=e1;edge2=e2;edge3=e3;
    }
    public double area()
    {
        double s =(edge1+edge2+edge3)/2.0;
        return Math.sqrt(s*(s-edge1)*(s-edge2)*(s-edge3));//Heron's Formula
    }
    public double circum(){
        return edge1+edge2+edge3;
    }
}