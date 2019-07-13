public class AreaCalculator {

    public static final double INVALID_VALUE_MESSAGE = -1;

    public static void main(String[] args) {
        double totalArea = area(5.0);
        System.out.println(totalArea);
        totalArea = area(-1);
        System.out.println(totalArea);
        totalArea = area(5.0, 4.0);
        System.out.println(totalArea);
        totalArea = area(-1.0, 4.0);
        System.out.println(totalArea);
    }

    public static double area (double radius) {
        if (radius < 0)  {
        return INVALID_VALUE_MESSAGE;
    } else {
        double totalArea = (Math.PI * (radius * radius));
        return totalArea;
            }

        }


    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE_MESSAGE;
    } else {
           double totalArea = (x * y);
            return totalArea;
        }



    }
}
