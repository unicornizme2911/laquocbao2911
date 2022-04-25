public class Circle extends Shape{
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double a){
        this.radius = a;
    }
    @Override
    public double getArea(){
        return this.radius*this.radius*3.14;
    }
    @Override
    public double getPerimeter(){
        return 2*this.radius*3.14;
    }
    @Override
    public boolean equals(Shape s){
        if(s.getArea() == this.getArea()){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Circle[ area = "+this.getArea()+", perimeter = "+this.getPerimeter()+"]";
    }
}