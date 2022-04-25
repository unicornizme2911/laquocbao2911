public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(){}
    @Override
    public void resize(int precent){
        this.radius *=(double)(percent)/100;
    }
}
