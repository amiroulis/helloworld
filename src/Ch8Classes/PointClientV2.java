package Ch8Classes;

public class PointClientV2 {
    public static void main(String[] args) {
        PointV1 p1 = new PointV1();
          System.out.println("p1: " + p1);
            p1.x = 3;
            p1.y = 6;
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        PointV1 p2 = new PointV1();
        p2.x = 7;
        p2.y = 1;
        System.out.println(p1.distance(p2));
        System.out.println(p1.distancwFromOrigin());
        // PointV2 p1 = new PointV2(3,6);
    }
}
