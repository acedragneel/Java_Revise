package patterns.creation.abstractfactory.guiplatform;

public class MacFactory implements GuiFactory{
    @Override
    public Button CreateButton() {
        return new MacButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new MacCheckbox();
    }
}
