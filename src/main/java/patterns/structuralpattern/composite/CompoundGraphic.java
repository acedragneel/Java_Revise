package patterns.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{

    private List<Graphic> childern = new ArrayList<>();

    public void add(Graphic child){
        childern.add(child);
    }

    public void remove(Graphic child){
        childern.remove(child);
    }


    public List<Graphic> getChildren() {
        return childern;
    }

    @Override
    public void move(int x, int y) {
        for(Graphic child : childern){
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a compound graphic:");
        for(Graphic child : childern){
            child.draw();
        }
    }
}
