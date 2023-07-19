package co.develhope.introduction.InheritanceOverload;

/**
 * Exercise: overload
 * Creating more than one method with the same name in the same class is called method overloading.
 *
 * Define a class called Shape that has:
 *
 * an instance variable shapeName
 * an instance variable numberOfEdges
 * 1 basic constructor method with no params that
 * informs the user about the Shape object creation
 * assign Undefined shape to the object's shapeName
 * 4 params overload constructor methods: for circle:
 * takes a double radius param
 * informs the user about the object creation
 * assigns the shapeName for square:
 * takes an int edges param and a double edgeLength param
 * informs the user about the object creation
 * assigns the values to numberOfEdges and to shapeName for rectangle:
 * takes an int edges param and 2 double (e1, e2) params
 * informs the user about the object creation
 * assigns the values to numberOfEdges and to shapeName for triangle:
 * takes an int edges param and 3 double (e1, e2, e3) params
 * informs the user about the object creation
 * assigns the values to numberOfEdges and to shapeName
 * a method called getShapeDetails() that returns an informative String containing:
 * shapeName
 * numberOfEdges
 * Define a testing class where you:
 *
 * create the 5 Shape objects using all the different constructor invocations
 * invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
 * print in console the values of the 5 dedicated String variables
 *
 */

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
