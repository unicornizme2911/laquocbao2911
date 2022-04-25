public class Circle implements GeometricObject{
    protected double radius;
    @Override
    public double getArea(){
        return 2*Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}
