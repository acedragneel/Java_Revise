package patterns.structuralpattern.decorator;

public class FileDataSource implements DataSource{

    public String fileName;

    public FileDataSource(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file: " + data);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from file.");
        return "file_data";
    }
}
