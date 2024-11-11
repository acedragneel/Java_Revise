package patterns.creation.factory.crossplatformservices;

public class WindowButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Rendering a Windows-style button.");
    }

    @Override
    public void render(Runnable action) {
        System.out.println("Binding Windows OS native click event.");
        action.run();
    }
}
