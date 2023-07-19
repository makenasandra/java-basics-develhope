package co.develhope.introduction.InheritanceOverload;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Shape(33.57);
        Shape square = new Shape(4, 56.90);
        Shape rectangle = new Shape(4, 58, 12);
        Shape triangle = new Shape(3, 98, 76, 32);

        String circleShapeDetails = circle.getShapeDetails();
        String squareShapeDetails = square.getShapeDetails();
        String rectangleShapeDetails = rectangle.getShapeDetails();
        String triangleShapeDetails = triangle.getShapeDetails();

        System.out.println(circleShapeDetails + "\n" + squareShapeDetails + "\n" + rectangleShapeDetails + "\n" + triangleShapeDetails);
    }
}
