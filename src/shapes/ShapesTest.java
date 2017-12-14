package shapes;


public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,4);

        System.out.println("rectangle's area is " + myShape.getArea());
        System.out.println("rectangle's perimeter is " + myShape.getPerimeter());

        myShape = new Rectangle(8, 3);
        System.out.println("The second rectangle's area is " + myShape.getArea());
        System.out.println("The second rectangle's perimeter is " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("The square's area is " + myShape.getArea());
        System.out.println("The square's perimeter is " + myShape.getPerimeter());
    }








//        Rectangle box1 = new Rectangle(5, 4);
//        Square box2 = new Square(5) {
//           @Override
//           public double getPerimeter() {
//               return super.getPerimeter();
//           }
//       };
//        System.out.println("Called from Rectangle\n");
//        System.out.println("area: " + box1.getArea());
//        System.out.println("perimeter: " + box1.getPerimeter());
//        System.out.print("<------------------>\n");
//        System.out.println("Called from Square\n");
//        System.out.println("area: " + box2.getArea());
//        System.out.println("perimeter: " + box2.getPerimeter());
//


        }





