
import java.util.Scanner;

interface Comparable {
    void comparing();
}

class Square {
    int s;
    int s1;
}

class ComparableSquare extends Square implements Comparable {
    int area1;
    int area2;

    public void area_1() {
        area1 = s * s;
        System.out.println("Area of square 1 is: " + area1);
    }

    public void area_2() {
        area2 = s1 * s1;
        System.out.println("Area of square 2 is: " + area2);
    }

    public void comparing() {
        if (area1 > area2) {
            System.out.println("Square with side: " + s + " is greater than square with side: " + s1);
        }

        else {
            System.out.println("Square with side: " + s1 + " is greater than square with side: " + s);
        }
    }
}

public class pr_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ComparableSquare c = new ComparableSquare();

        System.out.println("Enter the value of square 1 and square 2: ");
        int a = s.nextInt();
        int b = s.nextInt();

        c.s = a;
        c.s1 = b;

        c.area_1();
        c.area_2();

        c.comparing();
    }
}
