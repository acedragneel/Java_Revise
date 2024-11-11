package patterns.structuralpattern.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        super();
        this.squarePeg = squarePeg;
    }
    @Override
    public double getRadius() {
        // Calculate the minimum radius of a circle that can fit the square peg.
        return (squarePeg.getWidth() * Math.sqrt(2)) / 2;
    }
}
