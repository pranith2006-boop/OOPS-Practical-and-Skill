package skill6;

class Shape {
    public int findArea(int side) {
        return side * side;
    }

    public int findArea(int length, int breadth) {
        return length * breadth;
    }

    public double findArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of square: " + shape.findArea(5));
        System.out.println("Area of rectangle: " + shape.findArea(4, 6));
        System.out.println("Area of circle: " + shape.findArea(3.5));
    }
}
