package shapes;


public abstract class Square extends Quadrilateral implements Measurable{

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public double getPerimeter() {
        return side * 4;

    }


    public double getArea() {
        double side = length;
        return Math.pow(side, 2);
    }

    public void setLength(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
        this.side = side;
    }

}

