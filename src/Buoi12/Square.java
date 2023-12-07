package Buoi12;

public class Square implements Polygon{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void calArea() {
        System.out.println("Diện tích hv là: "+(side*side));
    }
}
