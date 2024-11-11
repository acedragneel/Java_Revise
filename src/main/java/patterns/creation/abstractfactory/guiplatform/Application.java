package patterns.creation.abstractfactory.guiplatform;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory guiFactory){
        this.button = guiFactory.CreateButton();
        this.checkBox = guiFactory.CreateCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
