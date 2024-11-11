package patterns.creation.factory.crossplatformservices;

abstract class Dialog {
    public abstract Button createButton();
    
    public void render(){
        Button okButton = createButton();
        okButton.render(this::closeDiaglog);
        okButton.onClick();
    }

    private void closeDiaglog() {
        System.out.println("Dialog closed.");
    }

}
