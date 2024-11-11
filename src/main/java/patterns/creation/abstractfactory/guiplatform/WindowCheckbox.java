package patterns.creation.abstractfactory.guiplatform;

public class WindowCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style checkbox.");
    }
}
