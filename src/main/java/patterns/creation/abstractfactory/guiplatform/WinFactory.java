package patterns.creation.abstractfactory.guiplatform;

public class WinFactory implements GuiFactory{
    @Override
    public Button CreateButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new WindowCheckbox();
    }
}
