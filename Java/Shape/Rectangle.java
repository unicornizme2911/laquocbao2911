public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    @Override
    public boolean equals(Shape s){
        if(s.getArea()==this.getArea()){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Rectangle["+getArea()+","+getPerimeter()+"]";
    }
}