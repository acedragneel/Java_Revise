package patterns.structuralpattern.composite;

import java.util.List;

public class ImageEditor {

    private CompoundGraphic all;

    // Initializes the main graphic container
    public ImageEditor() {
        all = new CompoundGraphic();
    }

    // Getter for the main CompoundGraphic
    public CompoundGraphic getAll() {
        return all;
    }

    // Loads individual graphics and adds them to the main container
    public void load() {
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
    }

    // Groups selected components into a new CompoundGraphic
    public void groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();

        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }

        all.add(group);
    }

    // Draws all graphics
    public void draw() {
        all.draw();
    }
}
