import java.util.Scanner;

interface Colorable {
    void howToColor();
}

class GeometricObject {

}

class square extends GeometricObject implements Colorable {
    public void howToColor() {
        System.out.println("Side 1 is colored white");
        System.out.println("Side 2 is colored red");
        System.out.println("Side 3 is colored blue");
        System.out.println("Side 4 is colored yellow");
    }

    private int side;
    private double sides;

    square(int s) {
        side = s;
    }

    square() {
        sides = 0;
    }

    public int getside() {
        return side;
    }

    public double getsides() {
        return sides;
    }

    public void setside(int side) {
        this.side = side;
    }

    public void setsides(double sides) {
        this.sides = sides;
    }
}

public class pr_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        square sq = new square();

        System.out.println("Enter the value of side and sides: ");
        int a = s.nextInt();
        double b = s.nextDouble();

        sq.setside(a);
        sq.setsides(b);

        System.out.println("The value of square of side and sides are: " + sq.getside() + " and " + sq.getsides());
        sq.howToColor();
    }
}