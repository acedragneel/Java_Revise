package patterns.structuralpattern.decorator;

public class CompressionDecorator extends  DataSourceDecorator{
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        System.out.println("Compressing data: " + compressedData);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decompress(data);
    }

    private String compress(String data) {
        return "compressed_" + data;
    }

    private String decompress(String data) {
        return data.replace("compressed_", "");
    }
}
