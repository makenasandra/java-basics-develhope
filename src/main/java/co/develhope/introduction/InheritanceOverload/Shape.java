package co.develhope.introduction.InheritanceOverload;

public class Shape {
    private String shapeName;
    private int numberOfEdges;

    Shape(){
        System.out.println("Shape object created!");
    }

    Shape(double radius){
        System.out.println("Shape object created!");
        this.shapeName = "circle";
    }

    Shape(int edges, double edgeLength ){
        System.out.println("Shape object created!");
        this.shapeName = "square";
        this.numberOfEdges = edges;
    }

    Shape(int edges,double e1,double e2){
        System.out.println("Shape object created!");
        this.shapeName = "rectangle";
        this.numberOfEdges = edges;
    }

    Shape(int edges, double e1,double e2,double e3){
        System.out.println("Shape object created!");
        this.shapeName = "triangle";
        this.numberOfEdges = edges;
    }
    public String getShapeDetails() {
        return
                "shapeName='" + shapeName + '\'' +
                ", numberOfEdges=" + numberOfEdges;
    }
}
