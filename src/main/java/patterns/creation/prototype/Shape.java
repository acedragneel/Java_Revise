package patterns.creation.prototype;

// Base prototype class
abstract class Shape {
    int x;
    int y;
    String color;

    // Default constructor
    public Shape() {}

    // Prototype constructor that copies data from an existing shape
    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    // Abstract clone method
    public abstract Shape clone();
}