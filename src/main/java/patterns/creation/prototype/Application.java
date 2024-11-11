package patterns.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Shape> shapes = new ArrayList<>();

    public Application(){
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 5;
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public void businessLogic(){
        List<Shape> shapesCopy = new ArrayList<>();

        for(Shape s: shapes){
            shapesCopy.add(s.clone());
        }

        // Display the original and cloned shapes
        System.out.println("Original Shapes:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        System.out.println("\nCloned Shapes:");
        for (Shape s : shapesCopy) {
            System.out.println(s);
        }
    }
}
