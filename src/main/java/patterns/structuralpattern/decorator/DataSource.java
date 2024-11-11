package patterns.structuralpattern.decorator;

public interface DataSource {

    void writeData(String data);
    String readData();
}
