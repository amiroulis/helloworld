package Ch8Classes;

public class PointClientV4 {
    public static void main(String[] args) {
        PointV4 p1 = new PointV4(3, 6);
          System.out.println("p1: " + p1);

        System.out.println("p1: (" + p1 + ", " + p1 + ")");
        PointV4 p2 = new PointV4(7, 1);
        PointV4 p3 = new PointV4();
        System.out.println(PointV4.getobjCount());



        System.out.println(p1.distance(p2));
        System.out.println(p1.distancwFromOrigin());
        // PointV2 p1 = new PointV2(3,6);

    }
}
