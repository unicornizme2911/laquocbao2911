public abstract class Shape{
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String a){
        this.color = a;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean b){
        this.filled = b;
    }
    public abstract boolean equals(Shape s);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}