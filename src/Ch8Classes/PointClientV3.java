package Ch8Classes;

public class PointClientV3 {
    public static void main(String[] args) {
        PointV3 p1 = new PointV3(3, 6);
          System.out.println("p1: " + p1);

        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        PointV3 p2 = new PointV3(7, 1);

        System.out.println(p1.distance(p2));
        System.out.println(p1.distancwFromOrigin());
        // PointV2 p1 = new PointV2(3,6);

    }
}
