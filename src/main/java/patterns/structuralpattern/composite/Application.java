package patterns.structuralpattern.composite;

import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        // Load initial graphics
        editor.load();
        System.out.println("Initial drawing:");
        editor.draw();

        // Use exact references from the editor's main compound graphic
        List<Graphic> selectedComponents = new ArrayList<>(List.of(
                editor.getAll().getChildren().get(0),  // Dot(1, 2)
                editor.getAll().getChildren().get(1)   // Circle(5, 3, 10)
        ));

        // Group selected components
        editor.groupSelected(selectedComponents);

        System.out.println("\nAfter grouping selected components:");
        editor.draw();
    }
}
