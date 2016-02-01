package rectanglePlus;


public  class RectanglePlus implements Relatable {

    public static int width = 0;
    public static int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    // a method required to implement
    // the Relatable interface
    @Override
    public int isLarger(Relatable other) {
        RectanglePlus otherRect
                = (RectanglePlus) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        RectanglePlus newRectanglePlus = new RectanglePlus();

        int x =(int) (Math.random() * 99);
        int y =(int) (Math.random() * 99);
        Point point = new Point(x,y);
        point.setYX(y,x);


        newRectanglePlus.isLarger(new RectanglePlus(point, width = point.getX(), height = point.getY()));
        newRectanglePlus.isLarger( new RectanglePlus(width = point.getX(), height = point.getY()));
        newRectanglePlus.isLarger(new RectanglePlus(point));

        System.out.println(newRectanglePlus.getArea());
        System.out.println(newRectanglePlus.isLarger(new RectanglePlus(point)));

    }

}

class Point {
    int top;
    int left;
    int x;
    int y;

    public Point(int t, int l) {
        top = t;
        left = l;
    }

    public int getX() {
        return x;
    }

    public void setYX(int x,int y) {
        this.x = x;
        this.y = y;

    }

    public int getY() {
        return y;
    }
}
