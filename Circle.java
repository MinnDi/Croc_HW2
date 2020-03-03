public class Circle extends Figure implements Movable{
        int r;
        Circle(int x,int y, int r){
            super(x,y);
            this.r=r;
        }
        public int getR() {
            return r;
        }

    @Override
    public void move(int dx, int dy) {
        super.setX(super.getX() + dx);
        super.setY(super.getY()+dy);
    }
}
