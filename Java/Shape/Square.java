public class Square extends Rectangle{
    public Square(){}
    public Square(double side , String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.setLength(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Square){
            Square s = (Square)o;
            if(this.getArea() > s.getArea()) return true;
        }
        return false;
    }
}