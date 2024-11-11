package patterns.creation.abstractfactory.guiplatform;

public class MacCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style checkbox.");
    }
}
