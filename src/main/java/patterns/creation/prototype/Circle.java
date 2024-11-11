package patterns.creation.prototype;

public class Circle extends Shape{
    int radius;

    public Circle(){}

    public Circle(Circle source){
        super(source);
        if(source != null){
            this.radius = source.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle { x=" + x + ", y=" + y + ", color=" + color + ", radius=" + radius + " }";
    }
}
