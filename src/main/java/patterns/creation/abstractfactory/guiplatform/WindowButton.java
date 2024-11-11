package patterns.creation.abstractfactory.guiplatform;

public class WindowButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style button.");
    }
}
