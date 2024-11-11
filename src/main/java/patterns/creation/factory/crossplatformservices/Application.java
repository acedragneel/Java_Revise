package patterns.creation.factory.crossplatformservices;

public class Application {

    public Dialog dialog;

    public void initialize(){
        String configOS = readApplicationConfigFile();
        if (configOS.equals("Windows")) {
            dialog = new WindowDialog();
        } else if (configOS.equals("Web")) {
            dialog = new HtmlDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }
    }

    private String readApplicationConfigFile() {
        return "Web";
    }

    public void main(){
        this.initialize();
        dialog.render();
    }

}


