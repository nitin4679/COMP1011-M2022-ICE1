import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {

        Vector2D point1 = new Vector2D();
        Vector2D point2 = new Vector2D(10.0f, 20.0f);
        Vector2D point3 = new Vector2D(40.0f,50.0f);


        System.out.println("Point1: " + point1.toString());
        System.out.println("Point2: "+ point2.toString());
        System.out.println("Point3: "+ point3.toString());

        float distance = Utility.Distance(point2, point3);
        System.out.println("Distance between point 2 and point 3 is: "+ distance );

    }
}