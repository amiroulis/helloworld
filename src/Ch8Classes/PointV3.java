package Ch8Classes;
//This class is a template to represent a point on this cartesion coordiante plane
public class PointV3 {
    //state field below
    public int x;
    public int y;
    public PointV3(int ix, int iy) {
        x = ix;
        y = iy;
    }
    public PointV3() {
        x = 0;
        y = 0;
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

    public double distance(PointV3 other) {
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
