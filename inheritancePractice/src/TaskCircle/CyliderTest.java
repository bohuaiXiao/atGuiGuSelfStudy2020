package TaskCircle;

public class CyliderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(2);
        cylinder.setRadius(5);

        System.out.println(cylinder.findVolume());
    }
}
