package ooplab8;

public class Rectangle implements Shape{
    private double Width;
    private  double length;

    public Rectangle(double width, double length) {
        Width = width;
        this.length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return  Width * length;
    }
}//class
