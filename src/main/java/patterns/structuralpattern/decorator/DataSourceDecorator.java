package patterns.structuralpattern.decorator;

public class DataSourceDecorator implements DataSource{
    protected DataSource wrapee;

    public DataSourceDecorator(DataSource source){
        this.wrapee = source;
    }

    @Override
    public void writeData(String data) {
        wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return wrapee.readData();
    }
}
