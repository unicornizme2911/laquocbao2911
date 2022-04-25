public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public String toString(){
        return "Circle: Center["+this.center+"]";
    }
    public void moveUp(){
        center.y += center.ySpeed;
    }
    public void moveDown(){
        center.y -= center.ySpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }
}