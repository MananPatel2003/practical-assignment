public class RegularPolygon_2main {
    public static void main(String[] args) {
        RegularPolygon_2 a = new RegularPolygon_2();
        RegularPolygon_2 b = new RegularPolygon_2(2, 3);
        RegularPolygon_2 c = new RegularPolygon_2(5, 6, 7, 8);
        System.out.println(a.getPerimeter());
        System.out.println(a.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(b.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());

    }
}
