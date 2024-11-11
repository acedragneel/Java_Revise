package patterns.creation.abstractfactory.guiplatform;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style button.");
    }
}
