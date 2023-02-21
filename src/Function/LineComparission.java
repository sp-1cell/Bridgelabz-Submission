package Function;

import java.util.Scanner;

public class LineComparission {
    int x;
    int y;

    void setPoint() {
        Scanner point = new Scanner(System.in);
        System.out.println("Enter the points :");
        int x = point.nextInt();
        int y = point.nextInt();
        this.x = x;
        this.y = y;
    }

    static double calculateLength(LineComparission point1, LineComparission point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }


    static void compareLine(Double distance1, Double distance2) {
        System.out.println("Calculated distance for first line: ");
        System.out.format("%.2f \n", distance1);
        System.out.println("Calculated distance for second line: ");
        System.out.format("%.2f \n", distance2);
        if (distance1.equals(distance2)) {
            System.out.println("Two lines are equal");
        } else if (Double.compare(distance1, distance2) > 0) {
            System.out.println("first  line is greater than second line");
        } else {
            System.out.println("first  line is lesser than second line");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to the line comparison program");
        Scanner scan = new Scanner(System.in);
        LineComparission point1 = new LineComparission();
        LineComparission point2 = new LineComparission();
        LineComparission point3 = new LineComparission();
        LineComparission point4 = new LineComparission();
        point1.setPoint();
        point2.setPoint();
        point3.setPoint();
        point4.setPoint();
        Double distance1 = calculateLength(point1, point2);
        Double distance2 = calculateLength(point3, point4);
        compareLine(distance1, distance2);


    }

}
