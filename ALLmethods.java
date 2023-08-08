package codes;
import java.util.*;

class Cylinder {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            radius = 0;
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            height = h;
        } else {
            height = 0;
        }
    }

    public void setDimension(double r, double h) {
        radius = r;
        height = h;
    }

    public Cylinder() {
        radius = 1;
        height = 1;
    }

    public Cylinder(double r, double h) {
        setRadius(r);
        setHeight(h);
    }

    public Cylinder(double s) {
        setRadius(s);
        setHeight(s);
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * radius * Math.PI * (height + radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class ALLmethods {
    public static void main(String[] args) {
        // Example of default constructor (no values defined)
        Cylinder c = new Cylinder();
        System.out.println("Lid area is: " + c.lidArea());
        System.out.println("Total surface area is: " + c.totalSurfaceArea());
        System.out.println("Volume is: " + c.volume());
        System.out.println();

        // Parameterized constructor (values given)
        Cylinder c1 = new Cylinder(12, 3.5);
        System.out.println("Lid area is: " + c1.lidArea());
        System.out.println("Total surface area is: " + c1.totalSurfaceArea());
        System.out.println("Volume is: " + c1.volume());
        System.out.println();

        // Radius is equal to height
        Cylinder c2 = new Cylinder(5);
        System.out.println("Lid area is: " + c2.lidArea());
        System.out.println("Total surface area is: " + c2.totalSurfaceArea());
        System.out.println("Volume is: " + c2.volume());
        System.out.println();

        // When radius and height are set separately
        Cylinder c3 = new Cylinder();
        c3.setRadius(3.5);
        c3.setHeight(5);
        System.out.println("Lid area is: " + c3.lidArea());
        System.out.println("Total surface area is: " + c3.totalSurfaceArea());
        System.out.println("Volume is: " + c3.volume());
        System.out.println();

        // User input for radius and height
        Scanner s = new Scanner(System.in);
        double R, H;
        System.out.print("Enter the radius: ");
        R = s.nextDouble();
        System.out.print("\nEnter the height: ");
        H = s.nextDouble();
        Cylinder c4 = new Cylinder();
        c4.setHeight(H);
        c4.setRadius(R);
        System.out.println("Lid area is: " + c4.lidArea());
        System.out.println("Total surface area is: " + c4.totalSurfaceArea());
        System.out.println("Volume is: " + c4.volume());
        System.out.println();
        s.close();

        // Set dimensions using setDimension method
        Cylinder c5 = new Cylinder();
        c5.setDimension(12, 22);
        System.out.println("Lid area is: " + c5.lidArea());
        System.out.println("Total surface area is: " + c5.totalSurfaceArea());
        System.out.println("Volume is: " + c5.volume());
        System.out.println();
    }
}
