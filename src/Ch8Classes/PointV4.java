package Ch8Classes;
//This class is a template to represent a point on this cartesion coordiante plane
public class PointV4 {
    //state field below
    private int x;
    private int y;
    private static int objCount;
    public PointV4(int x, int y) {
        objCount++;
        this.x = x;
        this.y = y;
    }
    public PointV4() {
        objCount++;
        x = 0;
        y = 0;
    }
    public static int getobjCount() {
        return objCount;
    }

    //behaviors below (methods)
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void setLocation(int newx, int newy) {
        x = newx;
        y = newy;
    }
    public int getX (){
        return x;

    }
    public int getY () {
        return y;

    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance(PointV4 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        double answer = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return answer;

    }

    public double distancwFromOrigin() {

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String toString() {
        return ("(" + x + ", " + y + ")");

    }
}
