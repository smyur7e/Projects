public class AreaCalculator {
    public static double area(double radius) {
        return radius >= 0 ? Math.PI * radius * radius : -1.0;
    }

    public static double area(double breath, double width) {
        if (breath >= 0 && width >= 0) {
            return breath * width;
        } else {
            return -1.0d;
        }
    }

    public static void testArea() {
        System.out.println("area(5.0) = " + area(5.0));
        System.out.println("area(-1) = " + area(-1));
        System.out.println("area(5.0, 4.0) = " + area(5.0, 4.0));
        System.out.println("area(-1.0, 4.0) = " + area(-1.0, 4.0));
    }
}