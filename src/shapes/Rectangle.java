package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length,width);
    }



    @Override
    public void setLength(double length) {
        length = length;
    }

    @Override
    public void setWidth(double width) {
        width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    protected double length;

    protected double width;

//    public Rectangle(double side) {
//
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter() {
//            return length * 2 + width * 2;
//        }
//
//        public double getArea() {
//            return length * width;
//        }

    }



