package patterns.structuralpattern.adapter;

public class Application {

    public static void main(String args[]){
        RoundHole hole = new RoundHole(5);

        RoundPeg peg = new RoundPeg(5);
        System.out.println("Does round peg fit? " + hole.fits(peg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Does small square peg fit? " + hole.fits(smallSquarePegAdapter)); // true
        System.out.println("Does large square peg fit? " + hole.fits(largeSquarePegAdapter)); // false

    }
}
