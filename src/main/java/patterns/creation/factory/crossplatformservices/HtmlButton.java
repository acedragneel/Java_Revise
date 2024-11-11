package patterns.creation.factory.crossplatformservices;

public class HtmlButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Rendering an HTML button.");
    }

    @Override
    public void render(Runnable action) {
        System.out.println("Binding web browser click event.");
        action.run();
    }
}
