package Buoi12;

public class Rectangle implements Polygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void calArea() {
        System.out.println("Diện tích hình chữ nhật là: "+(length* width));
    }
}
