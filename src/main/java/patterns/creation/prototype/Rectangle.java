package patterns.creation.prototype;

class Rectangle extends Shape {
    int width;
    int height;

    // Constructor to create a new Rectangle
    public Rectangle() {}

    // Prototype constructor that copies data from an existing rectangle
    public Rectangle(Rectangle source) {
        super(source); // Copy fields from the base class
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    // Override clone method to create a copy of the current Rectangle
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle { x=" + x + ", y=" + y + ", color=" + color + ", width=" + width + ", height=" + height + " }";
    }
}
