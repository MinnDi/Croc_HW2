public class BoundingBox extends Figure implements Movable{
    private int x;
    private int y;
    BoundingBox(int x1,int y1, int x2,int y2){
        super(x1,y1);
        this.x=x2;
        this.y=y2;
    }
    public int getX2(){
        return x;
    }
    public int getY2() {
        return y;
    }

    @Override
    public void move(int dx, int dy) {
        x=x+dx;
        y=y+dy;
        super.setX(super.getX() + dx);
        super.setY(super.getY()+dy);
    }
}
